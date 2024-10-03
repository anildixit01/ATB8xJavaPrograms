package sept.ex_27092024;

public class Task3 {
    public static void main(String[] args) {

        //Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.
      int a=1;
        int sum= 0;
       /* while (a<=100){
          sum= sum+a;
            a++;
        }
      System.out.println("the sum of numbers from 1 to 100 is :" + sum);*/

       do{
            sum  = sum+ a;
            a++;
        }while (a<=100);
        System.out.println("the sum of numbers from 1 to 100 is :" + sum);



    }
}
