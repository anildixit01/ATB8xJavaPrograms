package oct.ex_02102024;

public class Task3 {
    public static void main(String[] args) {


            //3.Create a Class  ATBStudent and 5 Objects - (A/B) - github.com

            ATBStudent object1=new ATBStudent();
            object1.age=30;
            //System.out.println(object1);
            System.out.println(object1.age);

            ATBStudent object2=new ATBStudent();
            object2.name="Anil";
            System.out.println(object2.name);

            ATBStudent object3=new ATBStudent();
            object3.phone=8077109101L;
            System.out.println(object3.phone);

            ATBStudent object4=new ATBStudent();
            object4.batch=9;
            System.out.println(object4.batch);


            ATBStudent object5=new ATBStudent();
            object5.address="Firozabad";
            System.out.println(object5.address);

    }
}
