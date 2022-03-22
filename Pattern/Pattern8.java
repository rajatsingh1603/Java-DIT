import java.util.Scanner;
public class Pattern8 {
    public static void main(String []args){
        System.out.println("Enter N:");
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            for(int j = n; j<i; j--){
                System.out.print(" ");
            }
            if(i==0 || i==n-1){
                for(int k = 0; k<= i; k++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            else{
                System.out.print("*");
                for(int m =1; m<(2*i-1); m++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
