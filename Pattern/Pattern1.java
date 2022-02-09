import java.io.*;
import java.util.*;

public class Pattern1{
    public static void main(String []args){
        System.out.println("Enter Rows and Cols:");
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        for(int i = 0; i<R; i++){
            for(int j = 0; j<C; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}