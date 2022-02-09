import java.io.*;
import java.util.*;
public class Pattern3{
    public static void main(String [] args){
        System.out.println("Enter N:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}