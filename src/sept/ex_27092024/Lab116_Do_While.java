package sept.ex_27092024;

public class Lab116_Do_While {
    public static void main(String[] args) {
        //  While -> int -> condition -> body -> increment / decrement
        // Do while  -> // int -> body -> condition -> incre / drement
        int a = 0;
        do{
            System.out.println("Print"+a); // output --> Print0 to Print9
            a++;
        }while (a<10);
    }

}
