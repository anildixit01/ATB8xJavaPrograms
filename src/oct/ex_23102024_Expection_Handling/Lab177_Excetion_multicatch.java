package oct.ex_23102024_Expection_Handling;

public class Lab177_Excetion_multicatch {
    public static void main(String[] args) {
    try {
    String ip = args[0]; //ArrayIndexOutOfBoundsException
    int a= Integer.parseInt(ip);
    int b= 100/a;
    System.out.println(b);
    }catch (ArithmeticException e){
    System.out.println(e.getMessage());

    }catch (ArrayIndexOutOfBoundsException e){
    System.out.println(e.getMessage());

    } catch (NumberFormatException e){
    System.out.println(e.getMessage());

    }catch (Exception e){
    System.out.println(e.getMessage());
    }finally {
        System.out.println("Always executed");
    }

    }
}
