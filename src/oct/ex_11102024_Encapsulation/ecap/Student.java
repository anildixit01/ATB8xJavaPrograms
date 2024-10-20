package oct.ex_11102024_Encapsulation.ecap;

public class Student {
    // instance varibles are private
    private String Name;
    private int age;
    public String address;

    public Student(String name, int age, String address) {
        Name = name;
        this.age = age;
        this.address = address;
    }

//Public getter and setter ,method

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address, boolean isAdmin) {
        if (isAdmin) {
            this.address = address;
        } else {
            System.out.println("Not Allowed");
        }

    }
}
