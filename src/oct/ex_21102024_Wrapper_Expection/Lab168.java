package oct.ex_21102024_Wrapper_Expection;

public class Lab168 {
    public static void main(String[] args) {
        String num = "10";
        //int a = num;
        Integer a=  Integer.valueOf(num);
        System.out.println(a);
        int a2= a; // unboxing

        // string to Primitive ?

        int a3 = Integer.parseInt(num);
        System.out.println(num);


    }


}
