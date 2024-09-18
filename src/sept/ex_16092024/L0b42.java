package sept.ex_16092024;

public class L0b42 {
    public static void main(String[] args) {

        // And && //  only true && true returns here
        // T // T---> T
        // T // F---> T
        // F//  T ---> F
        // F  // F---> F
        System.out.println(true  && true);
        System.out.println(true  && false);
        System.out.println(false  && true);
        System.out.println(false  && false);

    }
}
