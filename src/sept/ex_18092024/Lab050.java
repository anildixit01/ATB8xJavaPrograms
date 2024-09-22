package sept.ex_18092024;

public class Lab050 {
    public static void main(String[] args) {
        // type casting
        // widening- Implicit, Explecit-losses
        //Narrowing- Implecit, explicit (with data type), loss

        // widening
        byte b= 10;
        int a = b; // valid- implicit casting--Jvm
        int a1 = (int)b; // valid explicit casting ---jvm

        // narrowing
        int val = 300;
       // byte b1 = val; // invalid implicit casting --jvm
        byte b2=  (byte)val; // invalid explicit casting--loss of data
        System.out.println(b2);
    }
}
