package sept.ex_25092024;

public class Task2_factorial {
    public static void main(String[] args) {
      //Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        //
        //        // n = 1 ->  Fact = 1*1 -> 1
        //
        //        // n = 3 -> Fact = 3*2*1 -> 6


        int fact = 1;
        System.out.println("Factorial of 5 is ");

        for (int i=5; i>1; i--){
            fact = fact*i;
            System.out.println( +fact);
        }

    }
}
