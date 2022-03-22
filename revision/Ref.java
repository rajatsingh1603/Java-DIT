

public class Ref {
    public static void main(String args []){
        // Ref obj = new Ref();  // new will allocate memory for object
        // System.out.println(obj); //give class name + @ + hexcode  -- this is not a address
        // System.out.println(obj.toString());

        // String name = "rajat";
        // System.out.println(name);
        // System.out.println(name.toString());

        String a = "Java";
        String b = "Java";
        // String c = new String("Java");
        // System.out.println(a == b);

        // System.out.println(a == c);
        // System.out.println(b == c);

        String name = "Java";
        System.out.println(a == name);
        System.out.println(b == name);
        System.out.println(a == b);

        name = "kalam";

        System.out.println(a == name);
        System.out.println(b == name);
        System.out.println(a == b);






        
    }
}
