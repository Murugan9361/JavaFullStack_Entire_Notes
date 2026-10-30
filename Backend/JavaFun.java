
import java.util.Scanner;

public class JavaFun {
    void welcome() {
        System.out.println("Hello world");
    }

    int sum(int a,int b){
        return a+b;
    }

    double purscharse(int money){
        int soap=50;
        int tea=15;
        double discount=((soap+tea)*0.1);
        System.out.println(discount);


        double balance=money-(soap+tea);
        System.out.println(balance);

        return  balance+discount;
        
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

        JavaFun j1=new JavaFun();
        j1.welcome();
        System.out.print("Enter the number of a : ");
        int c=s1.nextInt();
        System.out.print("Enter the number of b : ");
        int d=s1.nextInt();

        int result=j1.sum(c,d);
        System.out.println("Sum Of the ans :"+result);
        

        // String word=j1.krishnan();
        // System.out.println(word);

        double packet=j1.purscharse(500);
        System.out.println("Balance : "+packet);
    }

}
