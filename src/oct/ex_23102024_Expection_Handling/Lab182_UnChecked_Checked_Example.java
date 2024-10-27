package oct.ex_23102024_Expection_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab182_UnChecked_Checked_Example {
    public static void main(String[] args) {
        try {
            int a= 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Unchecked!");
        }
        try {
    File f = new File("abc.txt");
    FileReader fr = new FileReader(f);
} catch (FileNotFoundException e) {
    System.out.println(e.getMessage());
} finally {
    System.out.println("Checked!");
}
    }
}
