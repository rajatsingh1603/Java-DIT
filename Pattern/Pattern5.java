import java.util.Scanner;

public class Pattern5{
    public static void main(String [] args){
        System.out.println("Enter N:");
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            for(int j = i; j<n; j++){
                if(i==0 || i==j || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}