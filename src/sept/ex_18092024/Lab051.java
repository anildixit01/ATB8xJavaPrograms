package sept.ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s= phone_no;  // narrowing --implicit --jvm//invalid
        short s1= (short)phone_no;  // narrowing --implicit --jvm//invalid
        System.out.println(s1);// explicit-loss // invalid


    }
}
