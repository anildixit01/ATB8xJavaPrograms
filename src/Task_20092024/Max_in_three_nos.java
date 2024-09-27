package Task_20092024;
import java.util.Scanner;
public class Max_in_three_nos {
    public static void main(String[] args) {
        // By using Ternary operator max between 3 numbers.
        // Input int - a,b,c - a = 10, b = 20, c = 45
        // Max → a,b,c → c
        //int max = a>b ? a:b;
/*by using scanner

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the Third number:  ");
        int c = sc.nextInt();
*/
        int a= 10;
        int b= 20;
        int c= 45;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }

}
