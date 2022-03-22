import java.util.Scanner;

public class Leapyear {
    public static void main(String [] args){

        System.out.println("Enter year");

        int year = new Scanner(System.in).nextInt();

        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("Leap year");
                    return;
                }
                else{
                    System.out.println("Not a Leap year");
                    return;
                }
            }

            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
        
    }
}
