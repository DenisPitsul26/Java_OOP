package lesson11.home_work11.parseSite;

import sun.net.www.protocol.http.HttpURLConnection;

import java.io.*;
import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseSite {
    private String urlAdress;
    private File file;
    String regex = new String("href=\"http(s)?:\\/{2}\\S*\"");

    public ParseSite(String urlAdress, File file) throws IOException {
        this.urlAdress = urlAdress;
        this.file = file;
        saveInFile(getStringFromURL());
    }

    private String getStringFromURL() throws IOException {
        if (file == null || urlAdress == null) {
            throw new IllegalArgumentException("Null reference file orl url.");
        }
        URL url = new URL(urlAdress);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        if (connection.getContentType().contains("text/html")) {
            StringBuilder result = new StringBuilder();
            try (InputStream is = connection.getInputStream()) {
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String temp = "";
                while ((temp = br.readLine()) != null) {
                    result.append(temp);
                }
                return result.toString();
            } catch (IOException e) {
                throw e;
            }
        }
        return "";
    }

    private void saveInFile(String str) throws IOException {
        if (str == null) {
            return;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        String temp="";
        try (Writer wr = new BufferedWriter(new FileWriter(file))) {
            while (matcher.find()) {
                temp=matcher.group();
                temp=temp.substring(6,temp.length()-1);
                wr.write(temp);
                ((BufferedWriter) wr).newLine();
            }
        } catch (IOException e) {
            throw e;
        }
    }
}
