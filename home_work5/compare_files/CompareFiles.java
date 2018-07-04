package lesson5.home_work5.compare_files;

import java.io.*;
import java.util.Arrays;

public class CompareFiles {
    private File fileOne;
    private File fileTwo;
    private String nameFile;

    public CompareFiles(File fileOne, File fileTwo, String nameFile) {
        this.fileOne = fileOne;
        this.fileTwo = fileTwo;
        this.nameFile = nameFile;
    }

    public File compare() {
        File temp = new File(nameFile);
        try (Reader inOne = new BufferedReader(new FileReader(fileOne));
             Writer out = new PrintWriter(new FileWriter(temp))) {
            String strOne;
            String strTwo;
            while ((strOne = ((BufferedReader) inOne).readLine()) != null) {
                String[] arrOne = breakLineIntoWords(strOne);
                try (Reader inTwo = new BufferedReader(new FileReader(fileTwo))) {
                    while ((strTwo = ((BufferedReader) inTwo).readLine()) != null) {
                        String[] arrTwo = breakLineIntoWords(strTwo);
                        for (int i = 0; i < arrOne.length; i++)
                            for (int j = 0; j < arrTwo.length; j++) {
                                if (arrOne[i].equals(arrTwo[j])) {
                                    ((PrintWriter) out).print(arrOne[i] + " ");
                                }
                            }
                    }
                }
            }
        } catch (IOException e) {

        }
        return temp;

    }


    private int countWordInLine(String line) {
        int n = 0;
        if (line.length() == 0) {
            return n;
        }
        for (int i = 0; i < line.length(); i++) {
            try {
                if (line.charAt(i) == ' ' && line.charAt(i + 1) != ' ') {
                    n++;
                }
            } catch (IndexOutOfBoundsException e) {
            }
        }
        return n + 1;
    }

    private String[] breakLineIntoWords(String line) {
        String[] words = new String[countWordInLine(line)];
        int startIndex = 0;
        int countWord = 0;
        for (int i = 0; i < line.length(); i++) {
            try {
                if (line.charAt(i) == ' ' && line.charAt(i + 1) != ' ') {
                    words[countWord] = line.substring(startIndex, i);
                    startIndex = i + 1;
                    countWord++;
                }
            } catch (IndexOutOfBoundsException e) {

            }
            if (line.charAt(line.length() - 1) == '.' || line.charAt(line.length() - 1) == '!' || line.charAt(line.length() - 1) == '?') {
                words[countWord] = line.substring(startIndex, line.length() - 1);
            } else {
                words[countWord] = line.substring(startIndex);
            }
        }
        return words;
    }


}
