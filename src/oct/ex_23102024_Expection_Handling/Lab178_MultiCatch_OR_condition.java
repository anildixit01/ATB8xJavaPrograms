package oct.ex_23102024_Expection_Handling;

public class Lab178_MultiCatch_OR_condition {
    public static void main(String[] args) {
       //int b=  0;   // ArithmeticException
        try {
            String ip = args[0]; //ArrayIndexOutOfBoundsException
            int a= Integer.parseInt(ip); //NumberFormatException
            int b= 100/a;
            System.out.println(b);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
