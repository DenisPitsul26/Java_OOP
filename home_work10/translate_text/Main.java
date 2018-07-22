package lesson10.home_work10.translate_text;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vocabulary vocabulary = new Vocabulary();
        Translator myTranslator = new Translator(vocabulary);

//        try {
//            myTranslator.translateFile(new File("English.in.txt"), new File("Ukraine.out.txt"));
//        } catch (IOException e){
//            System.out.println(e);
//        }

        try {
            vocabulary.saveInTxtFile(new File("vocabulary.txt"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
