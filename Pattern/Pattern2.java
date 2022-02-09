import java.io.*;
import java.util.*;
public class Pattern2{
    public static void main(String[] args){
        System.out.println("Enter Rows and Cols:");
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        for(int i =1; i<=R; i++){
            if(i==1 || i==R){
                for(int j =1; j<=R; j++){
                    System.out.print("*");
                }
                
            }
            
            else{
                System.out.print("*");
                for(int k = 1; k<=R-2; k++){
                    System.out.print(" ");
                }
                  System.out.print("*");
            }

            System.out.println();
            
        }



    }
}