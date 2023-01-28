package file;
import java.io.*;
import java.util.ArrayList;

public class Files {
    public static void main(String[] args) throws Exception{
        File file = new File("file.txt");
        ArrayList <StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("World"));
        int [] arr = {4, 8, 1};
        try{
            FileInputStream fio = new FileInputStream(file);
            fio.read();
            FileOutputStream fout = new FileOutputStream(file);
            fout.write(100);
        }catch(FileNotFoundException error){
            System.out.println("lol " + error);
        }finally{
            System.out.println("finally");
        }
    }
}
