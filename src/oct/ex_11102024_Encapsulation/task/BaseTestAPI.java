package oct.ex_11102024_Encapsulation.task;

public class BaseTestAPI {
    private String name;
    private int id;

    public BaseTestAPI() {
        System.out.println("Dc of BaseTestAPI");
    }

    public BaseTestAPI(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0) {
            this.id = id;
        } else {
            System.out.println("Enter valid id");
        }

    }
        public void performGet () {
            System.out.println("Performing GET");
        }
    public void performPost(){
            System.out.println("Performing POST");
    }
    public void performPatch(){
            System.out.println("Performing PATCH");
    }
    public void performPut(){
            System.out.println("Performing PUT");
        }
    public void performDelete(){
        System.out.println("Performing DELETE");
    }

}




