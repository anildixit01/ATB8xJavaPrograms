package sept.ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        int itemCode = 001; // JDK  >13 after ,  we can use -> in place of break;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
    }
}
