import java.util.Scanner;
public class Pattern7 {
    public static void main(String []args){
        System.out.println("Enter N:");
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            for(int j =0; j<=i; j++){
                System.out.print(" ");
            }

            for(int k =n; k>=(2*i-1); k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
