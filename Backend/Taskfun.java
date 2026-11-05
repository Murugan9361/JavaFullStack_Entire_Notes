
import java.util.Scanner;

public class Taskfun {

    void addStudent(int n) {
        Scanner s2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Student Name : ");
            String name = s2.nextLine();
            System.out.print("Enter the Tamil Mark : ");
            int tamil = s2.nextInt();
            System.out.print("Enter the English Mark : ");
            int english = s2.nextInt();
            System.out.print("Enter the maths Mark : ");
            int maths = s2.nextInt();
            System.out.print("Enter the science Mark : ");
            int science = s2.nextInt();
            System.out.print("Enter the ss Mark : ");
            int ss = s2.nextInt();
            s2.nextLine();
            System.out.println("Student Name :" + name);
            int total = tamil + english + maths + science + ss;
            System.out.println("Total " + total);
            int avg = total / 5;
            System.out.println("Avg " + avg);
            if (tamil < 35 || english < 35 || maths < 35 || science < 35 || ss < 35) {
                System.out.println("Fail");
                System.out.println("No Grade");
            } else {

                if (avg > 90 && avg < 100) {
                    System.out.println("Grade A : Very Good😁");
                } else if (avg > 80 && avg <= 90) {
                    System.out.println("Grade B : Good 😎");
                } else if (avg > 70 && avg <= 80) {
                    System.out.println("Grade c : Average 😒");
                } else {
                    System.out.println("No Grade .....🫪");
                }

            }
        }
    }

    int recur(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * recur(a - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        // System.out.println("Give the marks of 8th std ");
        // System.out.print("Enter the students Count : ");
        int a = s1.nextInt();

        Taskfun t1 = new Taskfun();
        // t1.addStudent(a);
        int fac = t1.recur(a);
        System.out.println(fac);

    }

}
