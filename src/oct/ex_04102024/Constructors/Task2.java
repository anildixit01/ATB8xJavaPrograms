package oct.ex_04102024.Constructors;

public class Task2 {
    public static void main(String[] args) {
        //Using default constructor

        Person p1=new Person();

        //This is for parameterized constructor
        Person p2= new Person("Anil","Dixit",30,"Male",807710910l,1234567890,"asdfgrtersdf","anildixit01gmail.com","firozabad","indian");

        System.out.println(p2.FirstName);
        System.out.println(p2.LastName);
        System.out.println(p2.age);
        System.out.println(p2.Gender);
        System.out.println(p2.Mobile_no);
        System.out.println(p2.Adhar_no);
        System.out.println(p2.Address);
        System.out.println(p2.Nationality);
        System.out.println(p2.PAN_no);
        System.out.println(p2.Email);


        Person p3= new Person("Amit","kumar",30,"Male",8077109102l,1234567891,"sdfhfgrtersdf","amitkumar02gmail.com","firozabad","indian");

        System.out.println(p3.FirstName);
        System.out.println(p3.LastName);
        System.out.println(p3.age);
        System.out.println(p3.Gender);
        System.out.println(p3.Mobile_no);
        System.out.println(p3.Adhar_no);
        System.out.println(p3.Address);
        System.out.println(p3.Nationality);
        System.out.println(p3.PAN_no);
        System.out.println(p3.Email);

        Person p4=new Person();
        Person p5=new Person();




    }
}
