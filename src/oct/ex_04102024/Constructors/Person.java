package oct.ex_04102024.Constructors;

public class Person {

    // Attribute
    String FirstName;
    String LastName;
    int age;
    String Gender;
    long Mobile_no;
    long Adhar_no;
    String PAN_no;
    String Email;
    String Address;
    String Nationality;

    Person() {
        System.out.println("default constructor created");
    }


    // Behavior / > Methods (function within the class)
    void walk() {}
    void talk() {}
    void read() {}
    void Search(){}
    void work(){}

    //Parameterized Constructor
    Person(String FirstName, String lastname,int age,String Gender,long mobile_no,long adhar_no,String PAN_no,String Email,String Address,String Nationality){
        System.out.println("Hi, I am a parameterized constructor");

        this.FirstName = FirstName;
        this.LastName = lastname;
        this.age = age;
        this.Gender = Gender;
        this.Mobile_no = mobile_no;
        this.Adhar_no = adhar_no;
        this.PAN_no = PAN_no;
        this.Email = Email;
        this.Address = Address;
        this.Nationality = Nationality;
    }
}


