class A{
    String un;
    String ps;
    static int count;

    A(String un, String ps){

        this.un = un;
        this.ps = ps;
        count++;
        System.out.println("count: " + count);
    }
}

public class Static {
    public static void main(String [] args){

        A a = new A("rajat","pass");
        A a1 = new A("kalam","123");
    }
}
