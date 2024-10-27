package oct.ex_25102024_Arrays;

public class Lab189_Arrays_String {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Pramod";
        names[1] = "Dutta";
        names[2] = "lucky";
        names[3] = "Amit";
        names[4] = "Anil";
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names [4]);
        System.out.println(names[5]); //ArrayIndexOutOfBoundsException


    }
}
