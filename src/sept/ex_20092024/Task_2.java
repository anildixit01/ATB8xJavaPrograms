package sept.ex_20092024;

public class Task_2 {
    public static void main(String[] args) {
        // By using Ternary operator max between 3 numbers.
        // Input int - a,b,c - a = 10, b = 20, c = 45
        // Max → a,b,c → c
        //int max = a>b ? a:b;

        int a= 10;
        int b= 20;
        int c= 45;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }
}
