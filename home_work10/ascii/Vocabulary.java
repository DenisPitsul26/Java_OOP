package lesson10.home_work10.ascii;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Vocabulary {
    private Map<Character, Integer[][]> vocabularyASCII = new HashMap<>();
    File file;

    public Vocabulary(File file) throws IOException {
        this.file = file;
        doMapASCII();
    }

    private void doMapASCII() throws IOException {
        if (this.file == null) {
            throw new IllegalArgumentException("Null reference file.");
        }
        Representation[] temp = ReadForMap.readInArr(this.file);
        for (int i = 0; i < temp.length; i++) {
            vocabularyASCII.put(temp[i].getCh(), temp[i].getLetter());
        }
    }

    public void writeInASCII(String str) {
        str = str.toUpperCase();
        char[] chArr = str.toCharArray();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < chArr.length; j++) {
                if (chArr[j] == ' ') {
                    System.out.print("  ");
                    continue;
                }
                Integer[][] temp = vocabularyASCII.get(chArr[j]);
                for (int k = 0; k < 7; k++) {
                    if (temp[i][k] == 0) {
                        System.out.print(" ");
                    } else System.out.print("#");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
