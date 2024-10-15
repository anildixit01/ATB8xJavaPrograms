package oct.ex_11102024.task;

public class ApiAutomation {
    public static void main(String[] args) {
        //using setter and getter method
        BaseTestAPI t1=new TestCaseAPI();   //Dynamic dispatch
        t1.setId(101);
        t1.setName("Rahul");
        System.out.println(t1.getId());
        System.out.println(t1.getName());

        //performing HTTP operation using TestCaseApi
           t1.performGet();
           t1.performPost();
           t1.performPut();
           t1.performDelete();
           t1.performPatch();

    }

}

