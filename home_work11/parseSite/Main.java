package lesson11.home_work11.parseSite;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            ParseSite parseSite = new ParseSite("http://www.kino-ukraina.com.ua/", new File("kino.txt"));

        } catch (IOException e) {
            System.out.println(e);
        }



    }
}
