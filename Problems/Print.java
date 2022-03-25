import java.util.Scanner;

public class Print {
    public static void main(String args[]){
        System.out.println("Enter:");
        int n = new Scanner(System.in).nextInt();
        int temp = n;
        int count = 0;
        while(temp != 0){
            temp = temp/10;
            count++;
        }

        while(count != 0){
            int num = (int)Math.pow(10, count-1);
            System.out.println(n/num);
            n = n%num;
            count--;
        }
    }
}
