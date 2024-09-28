package Task_20092024;

public class Task5_Leap_year_check {
    public static void main(String[] args) {
        int year= 2024; // we can change  year
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }

    }
}
