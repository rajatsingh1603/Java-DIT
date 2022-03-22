import java.util.Scanner;

public class Countdigit {
   public static void main(String args[]){
       System.out.println("Enter value");
       int n = new Scanner(System.in).nextInt();

       int count = 0;

       while(n != 0){
           n = n/10;
           count++;
       }
       System.out.println(count);
   } 
}
