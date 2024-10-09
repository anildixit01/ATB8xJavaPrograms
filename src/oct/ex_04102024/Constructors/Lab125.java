package oct.ex_04102024.Constructors;

public class Lab125 {
    public static void main(String[] args) {

                AHuman amit = new AHuman();
                AHuman pramod = new AHuman("pramod");
                AHuman vijay = new AHuman();
                System.out.println(amit.planet);
                System.out.println(pramod.planet);

                System.out.println(amit.name);
                System.out.println(pramod.name); // Pramod
                System.out.println(vijay.name); // Vijay


    }
}
