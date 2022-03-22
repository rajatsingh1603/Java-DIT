import java.util.Scanner;
public class Series {
    public static void main(String args[]){
        System.out.println("Enter number");
        int n = new Scanner(System.in).nextInt();

        for(int i = 0; i<n; i++){
            System.out.println((int)Math.pow(2, i));
        }
    }
}
