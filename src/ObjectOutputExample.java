import java.io.*;


public class ObjectOutputExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Data/Data2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Stock[] s1 = {
                    new Stock(1, "CD ROM", 100, 2)
                    ,new Stock(2, "CPU", 500, 2)
            };
            Stock s= new Stock(1,"Hieu",1,1);
            Stock a=new Stock(4,"Trung",100,3)
            ;
            oos.writeObject(a);
            oos.writeObject(s);
            oos.writeObject(s1);
            fos.close();
            oos.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: "+ex);
        }

    }
}