package Task_20092024;

public class task_grade {
    public static void main(String[] args) {
       // Ternary Operators to handle multiple conditions.

        // Input → int score = 85

        // String grade →

        //  score >= 90 → A
        //  score >= 80 → B
    //  score >= 70 → C
        int score= 85;

        String grade= score>=90 ? "A": score>=80? "B": score>=70? "C" :"F";
        System.out.println(grade);

    }
}
