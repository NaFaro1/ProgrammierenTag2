import java.util.Scanner;

public class GraddingTable {
    public static void main(String[] args) {
        int grade;
        System.out.println("Please Enter your Marks!");
        Scanner sc = new Scanner(System.in);
        grade = sc.nextInt();
        if (grade>=90){
            System.out.println("Outstanding");
        } else if (grade>=78) {
            System.out.println("Excellent");
        } else if (grade>=65) {
            System.out.println("Acceptable");


        } else if (grade>=51) {
            System.out.println("Passing");

        }
   else {
            System.out.println("Fail");
        }

    }
}
