package lesson5.home_work5.copy_files;

import java.io.File;
import java.io.IOException;

public class MainCopy {
    public static void main(String[] args) {

        CopyFiles test = new CopyFiles(new File("D:\\різне"), new File("D:\\Test"),
                new String[]{"PDF"});
        try {
            test.copy();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
