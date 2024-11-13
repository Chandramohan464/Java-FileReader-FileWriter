package FileWriter;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("testout.txt");
            fw.write("This String is written through java code");
            fw.close();
            System.out.println("Successfully witten through file");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
