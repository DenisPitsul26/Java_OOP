package lesson10.home_work10.translate_text;

import java.io.*;
import java.util.Map;

public class Translator {
    private Map<String, String> vocabulary;

    public Translator(Vocabulary vocabulary)
    {
        this.vocabulary = vocabulary.getVocabulary();
    }

    private String[] readText(File inFile) throws IOException {
        if (inFile == null) {
            throw new IllegalArgumentException("Null reference to the incoming file.");
        }
        StringBuilder res = new StringBuilder();
        String temp;
        try (Reader in = new BufferedReader(new FileReader(inFile))) {
            while ((temp = ((BufferedReader) in).readLine()) != null) {
                res.append(temp);
            }
        } catch (IOException e) {
            throw e;
        }
        return res.toString().split("\\W+");
    }

    private void writeText(String str, File outFile) throws IOException {
        if (outFile == null) {
            throw new IllegalArgumentException("Null reference to the outgoing file.");
        }
        try (Writer out = new BufferedWriter(new FileWriter(outFile))) {
            out.write(str);
        } catch (IOException e) {
            throw e;
        }
    }

    private String[] translateText(String[] inArr) {
        String[] outArr = new String[inArr.length];
        for (int i = 0; i < inArr.length; i++) {
            outArr[i] = vocabulary.get(inArr[i]);
        }
        return outArr;
    }

    private String makeRow(String[] arr){
        StringBuilder res = new StringBuilder();
        for (String element: arr) {
            res.append(element).append(" ");
        }
        res.replace(res.lastIndexOf(" "),res.lastIndexOf(" "),".");

        return res.toString();
    }

    public void translateFile (File inFile, File outFile) throws IOException {
        writeText(makeRow(translateText(readText(inFile))),outFile);
    }
}
