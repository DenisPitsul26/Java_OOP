package lesson11.home_work11.list_site;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CheckListSite {
    private Set<String> setSite = new HashSet<>();
    private File list;

    public CheckListSite(File list) throws IOException {
        this.list = list;
        initSet();
    }

    private void initSet() throws IOException {
        if (list == null) {
            throw new IllegalArgumentException("Null reference");
        }
        try (Reader is = new BufferedReader(new FileReader(list))) {
            String temp = "";
            while ((temp = ((BufferedReader) is).readLine()) != null) {
                setSite.add(temp);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public void check(File okFile, File notOkFile) {
        if (okFile == null || notOkFile == null) {
            throw new IllegalArgumentException("Null reference ok/notok file");
        }

        Iterator<String> iterator = setSite.iterator();
        URL url;
        HttpURLConnection connection;
        String tempAdress = "";
        int codeRespond;
        try (Writer wrOk = new BufferedWriter(new FileWriter(okFile));
             Writer wrNotOk = new BufferedWriter(new FileWriter(notOkFile))) {

            while (iterator.hasNext()) {
                try {
                    tempAdress = iterator.next();
                    url = new URL(tempAdress);
                    connection = (HttpURLConnection) url.openConnection();
                    codeRespond = connection.getResponseCode();
                    if (codeRespond >= 200 && codeRespond < 300) {
                        wrOk.write(tempAdress);
                        ((BufferedWriter) wrOk).newLine();
                        wrOk.write(codeRespond + " " + connection.getResponseMessage());
                        ((BufferedWriter) wrOk).newLine();
                        ((BufferedWriter) wrOk).newLine();
                    } else {
                        wrNotOk.write(tempAdress);
                        ((BufferedWriter) wrNotOk).newLine();
                        wrNotOk.write(codeRespond + " " + connection.getResponseMessage());
                        ((BufferedWriter) wrNotOk).newLine();
                        ((BufferedWriter) wrNotOk).newLine();
                    }
                } catch (IOException e) {
                    wrNotOk.write(tempAdress);
                    ((BufferedWriter) wrNotOk).newLine();
                    ((BufferedWriter) wrNotOk).newLine();
                }
            }

        } catch (IOException e) {
            System.out.println(e + " WRONG FILES!");
        }

    }


}
