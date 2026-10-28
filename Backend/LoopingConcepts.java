import java.util.Scanner;

public class LoopingConcepts {
    public void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Looping Count : ");
        int num = scan.nextInt();

        int ini = 0;
        while (ini <= num) {
            System.out.println(ini);
            ini++;
        }

        do {
            System.out.println(ini);
            ini--;

        } while (ini >= 0);

        System.out.print("Enter Your age : ");
        int age = scan.nextInt();

        String result = age >= 18 ? "eligible for vote" : "Not eligible for vote";

        System.out.println("result : " + result);

        int lenNum = scan.nextInt();

        int evencount = 0;
        int oddcount = 0;
        int[] even = new int[evencount + 1];
        int[] odd = new int[oddcount + 1];

        for (int i = 0; i < lenNum; i++) {
          
            System.out.print("Enter the Number : ");
            int n = scan.nextInt();

            if (n % 2 == 0) {

                even[evencount] = n;
                evencount++;

            } else {
                odd[oddcount] = n;
                oddcount++;
            }

            

        }
        for(int a:even){
                System.out.println("Even Number :"+a);
            }


    }
}
