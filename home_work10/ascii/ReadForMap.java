package lesson10.home_work10.ascii;

import java.io.*;

public class ReadForMap {


    public static Representation[] readInArr(File file) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("Null");
        }
        Representation[] representations = new Representation[26];
        int count = -1;
        int n = 0;
        String temp;
        try (Reader is = new BufferedReader(new FileReader(file))) {

            while ((temp = ((BufferedReader) is).readLine()) != null) {
                if (temp.length() == 1) {
                    count++;
                    representations[count] = new Representation();
                    representations[count].setCh(temp.charAt(0));
                    n = 0;
                } else {
                    for (int i = 0; i < 7; i++) {
                        if (temp.charAt(i) != ' ') {
                            representations[count].getLetter()[n][i] = 1;
                        } else {
                            representations[count].getLetter()[n][i] = 0;
                        }
                    }
                    n++;
//                    System.out.println();
                }
            }
        } catch (IOException e) {
            throw e;
        }
        return representations;
    }

}
