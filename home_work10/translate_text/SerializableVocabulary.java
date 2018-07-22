package lesson10.home_work10.translate_text;

import java.io.*;

public class SerializableVocabulary {

    public static void saveVocabulary(File file, Vocabulary vocabulary) throws IOException {
        if (file == null || vocabulary == null) {
            throw new IllegalArgumentException("Null reference");
        }
        try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))) {

            oos.writeObject(vocabulary);

        } catch (IOException e) {
            throw e;
        }
    }

    public static Vocabulary loadVocabulary (File file) throws IOException, ClassNotFoundException {
        if (file==null){
            throw new IllegalArgumentException("Null reference");
        }
        try(ObjectInput ois = new ObjectInputStream(new FileInputStream(file))){
            return (Vocabulary) ois.readObject();
        } catch (IOException e){
            throw e;
        }
    }
}
