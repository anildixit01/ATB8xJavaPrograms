package oct.ex_25102024_Arrays;

public class Lab187_Arrays {
    public static void main(String[] args) {
        int [] marks = {51, 100, 91, 87, 90};
                      //Location : 0 ,1,2,3,4
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);   //ArrayIndexOutOfBoundsException

        int [] marks_2 = new int[5];
        // 5 length
        marks_2[0] = 11;
        marks_2[1] = 12;
        marks_2[2] = 13;
        marks_2[3] = 14;
        marks_2[4] = 15;
        System.out.println(marks_2[0]);
        System.out.println(marks_2[1]);
        System.out.println(marks_2[4]);
//        System.out.println(marks[5]); .ArrayIndexOutOfBoundsException



    }
}
