import java.io.*;

public class ObjectInputExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Data/Data2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object a;
            while ((a=ois.readObject())!=null){
                System.out.println(a);;
            }
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Đã hết file");
        }
    }
}