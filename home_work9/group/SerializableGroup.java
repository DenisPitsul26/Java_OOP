package lesson9.home_work9.group;

import java.io.*;

public class SerializableGroup {

    public static void saveGroup(File file, Group group) throws IOException{
        if (file==null || group == null){
            throw  new IllegalArgumentException("Null reference");
        }
        try (ObjectOutput  oos = new ObjectOutputStream(new FileOutputStream(file))){

            oos.writeObject(group);

        } catch (IOException e){
            throw e;
        }
    }

    public static Group loadGroup(File file) throws IOException, ClassNotFoundException {
        if (file == null){
            throw new IllegalArgumentException("Null reference");
        }
        try (ObjectInput oi = new ObjectInputStream(new FileInputStream(file))){
            return (Group) oi.readObject();
        } catch (IOException e){
            throw e;
        }
    }

}
