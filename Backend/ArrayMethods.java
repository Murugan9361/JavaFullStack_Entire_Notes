
import java.util.Arrays;

public class ArrayMethods {
    static void main() {
        int[] numbers = { 25, 58, 69, 21, 56, 89, 65 };

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 58));

        int[] even = new int[5];
        Arrays.fill(even, 100);
        System.out.println(Arrays.toString(even));

        int[] values = Arrays.copyOfRange(numbers, 3, 10);
        System.out.println(Arrays.toString(values));

        int[] a = { 10, 20, 30 };
        int[] b = { 10, 20, 30, 85 };

        System.out.println(Arrays.equals(a, b));

        int sum = Arrays.stream(b).sum();
        System.out.println("Total : " + sum);
        int[][] data = { { 10, 20 }, { 30, 50 } };

        System.out.println(Arrays.deepToString(data));

        String[] names = { "Gayathiri", "priya", "kavitha", "rathis", "kavitha", "priya" };
        String[] duplicated = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int count = 0;
            for (int j = 0; j < names.length; j++) {
                if (name.equalsIgnoreCase(names[j])) {
                    count++;
                }

            }

            if (count >1 ) {
                System.out.println("Duplicated Value :  ");
                 System.out.println(name);
            }
            else{
                System.out.println(" not Duplicated Value :  ");
                 System.out.println(name);
            }
           

        }

      String[] stds={"ganesh kumar","Suresh kumar"};

      for(String s:stds){
        System.out.println(s.replace(" ", ""));
      }

     String word="java python django react"; // react django python java

     String[] reverseword=word.split(" ");

     String ans="";

     for(int i=reverseword.length-1;i>=0;i--){
         ans+=reverseword[i]+" ";
     }
     System.out.println(ans);

     

        // for(String n:names){
        // String data1=n.toLowerCase();
        // int count=0;
        // for(int i=0;i<data1.length();i++){
        // if(data1.charAt(i)=='a'||data1.charAt(i)=='e'||data1.charAt(i)=='i'||data1.charAt(i)=='o'||data1.charAt(i)=='u'){
        // count++;
        // }

        // }
        // System.out.println(n+" = "+count);
        // }
        String k="welcome";
        k="Hello";


        System.out.println(k);

    }
    


}
