import java.util.Scanner;

public class Buffer {
    public static void main(String args []){

        Scanner scanner = new Scanner("Hello I am Rajat\n I am a disco dancer \n kalam is brilliant of all\n");
        // int wordCount = 0;
        // while(scanner.hasNext()){
        //     wordCount++;
        //     System.out.println(scanner.next());
        // }
        // System.out.println(wordCount);

        int lineCount = 0;
        while(scanner.hasNextLine()){
            lineCount++;
            System.out.println(scanner.nextLine());
        }

        System.out.println(lineCount);

        scanner.close();
    }
}
