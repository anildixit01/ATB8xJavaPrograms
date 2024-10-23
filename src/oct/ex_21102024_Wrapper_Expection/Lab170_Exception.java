package oct.ex_21102024_Wrapper_Expection;

public class Lab170_Exception {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        String ip = args[0];  //10
        //String ip1= args[1];
        //String ip2= args[2];
        System.out.println(ip);
       // System.out.println(ip1);
        // System.out.println(ip2);

        int a= Integer.parseInt(ip);  // 10
        int b= 1000/a;  // a= 10
        System.out.println(b);  // output 100
        System.out.println("End of the Program");



    }
}
