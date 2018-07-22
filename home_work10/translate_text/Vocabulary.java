package lesson10.home_work10.translate_text;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Vocabulary implements Serializable {
    private Map<String, String> vocabulary = new TreeMap<>(); // for save in alphabet order
//    private Map<String, String> vocabulary = new HashMap<>();

    public Vocabulary() {
        vocabulary.put("I", "Мені");
        vocabulary.put("like", "подобається");
        vocabulary.put("learning", "вчити");
        vocabulary.put("java", "java");
    }

    public Map<String, String> getVocabulary() {
        return vocabulary;
    }

    public boolean addWord(String englishWord, String ukraineWord, boolean replace) {
        if (replace || !vocabulary.containsKey(englishWord)) {
            vocabulary.put(englishWord, ukraineWord);
            return true;
        }
        return false;
    }

    public void saveInTxtFile(File file) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("Null reference");
        }
        try (Writer os = new BufferedWriter(new FileWriter(file))) {
            vocabulary.forEach((key, value) -> {
                try {
                    os.write(key + " - " + value);
                    ((BufferedWriter) os).newLine();
                } catch (IOException e) {
                    System.out.println(e);
                }
            });
        } catch (IOException e) {
            throw e;
        }

    }

    @Override
    public String toString() {
        return vocabulary.toString();
    }
}
