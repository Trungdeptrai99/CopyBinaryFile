import java.io.*;
public class ObjectInputExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Data/Data2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Stock sArr[] = (Stock[]) ois.readObject();
            for(Stock s : sArr){
                System.out.println(s.toString());
            }
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.err.println("Loi doc file: "+ex);
        }
    }
}