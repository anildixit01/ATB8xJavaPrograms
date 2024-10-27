package oct.ex_23102024_Expection_Handling;

public class Lab186_try {
    public static void main(String[] args) {
        try {
            int c= 10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // if condition // handling
    }

}
