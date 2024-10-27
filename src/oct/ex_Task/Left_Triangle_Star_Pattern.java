package oct.ex_Task;

public class Left_Triangle_Star_Pattern {
    public static void main(String[] args) {
       /* Left Triangle Star Pattern

    *****
    ****
    ***
    **
    *           */
        int n = 5;

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
