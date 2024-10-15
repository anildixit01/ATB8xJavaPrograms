package oct.ex_11102024.ecap;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul",30, "Delhi");
       // System.out.println(s1.address);
        // s1.address= "Noida";
        System.out.println(s1.getAddress());

        // Checking Admin
        boolean isAdmin = true;

        // vwoLogin1.setYourKey("admin");
        s1.setAddress("Noida",isAdmin);
        System.out.println(s1.getAddress());

    }

}
