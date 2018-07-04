package lesson5.home_work5.compare_files;

import java.io.File;

public class MainCompare {
    public static void main(String[] args) {
        CompareFiles myFiles = new CompareFiles(new File("myFile.txt"),new File("myFilee.txt"),"hz.txt");
        myFiles.compare();
    }
}
