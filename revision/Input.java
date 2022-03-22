import java.util.Scanner;

public class Input {
    public static void main(String args []){

        // command line argument

        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // System.out.println(a+b);

        // int sum = 0;
        // for(int i = 0; i<args.length; i++){
        //     sum += Integer.parseInt(args[i]);
        // }
        // System.out.print(sum);

        //scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values to add--");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // scanner.close();

        System.out.println(a+b);

        // String name = scanner.next();
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println(name);



    }
}
