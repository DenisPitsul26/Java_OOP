package lesson11.home_work11.list_site;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File listSite = new File("checkListFile/ListSite.txt");
        File okFile = new File("checkListFile/okList.txt");
        File notOkFile = new File ("checkListFile/notOkFile.txt");
        CheckListSite checkListSite;
        try {
             checkListSite = new CheckListSite(listSite);
            checkListSite.check(okFile,notOkFile);
        } catch (IOException e) {
            System.out.println("ERROR!  "+e);
        }

    }
}
