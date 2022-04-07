import java.util.LinkedList;

class X{
    // final int a = 10; //lazy way
    // final int b = 20;

    final int a;
    final int b;

    X(){
        a=10;
        b=20;
    }

    X(int a, int b){
        // this(); //initializing final a and b or another way is downward 
        this.a = a;  // initializing final a and b
        this.b = b;
    }

}
public class Final {
    public static void main(String args[]){
        final LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("amit");
        linkedList.add("rajat");

        System.out.println(linkedList);
    }
}
