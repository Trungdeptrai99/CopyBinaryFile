import java.io.*;
public class ObjectOutputExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Data/Data2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Stock s[] = {
                    new Stock(1, "CD ROM", 100, 2)
                    ,new Stock(2, "CPU", 500, 2)
                    ,new Stock(3, "HP Scanner", 75, 1)
            };
            oos.writeObject(s);
            fos.close();
            oos.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: "+ex);
        }

    }
}