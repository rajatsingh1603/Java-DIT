import java.util.Scanner;

public class Pattern6 {
    public static void main(String [] args){
        System.out.println("Enter N:");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       for(int i =0; i<n ; i++){
           for(int j =n; j> i; j--){
               System.out.print(" ");
           }
           for(int k = 0 ; k < (2*i-1); k++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
