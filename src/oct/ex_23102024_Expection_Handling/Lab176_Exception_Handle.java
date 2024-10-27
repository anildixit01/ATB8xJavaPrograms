package oct.ex_23102024_Expection_Handling;

public class Lab176_Exception_Handle {
    public static void main(String[] args) {

        int a= 0;
        try{
            int c= 10/a;   //ArithmeticException
            System.out.println(c); // never executed
        }catch (Exception e){
            System.out.println(e.getMessage()); // ArithmeticException
        } finally {
            System.out.println("Always executed");

        }

    }
}
