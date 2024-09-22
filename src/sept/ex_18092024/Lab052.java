package sept.ex_18092024;

public class Lab052 {
    public static void main(String[] args) {

        // gst = 18.45;
        int course = 100;
        float GST = 18.45f;
        // int total_price= course+GST;    Narrowing- implicit Jvm  invlid
         int total_price= course+(int)GST;  //Narrowing- explicit Jvm  invlid
        System.out.println(total_price); // op =118 and loss 45 rs.
    }
}
