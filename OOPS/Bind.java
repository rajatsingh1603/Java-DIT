class A1 {
    int x;

    A1() {
        x = 10;
    }

    void show() {
        System.out.println("A1 show");
    }
}

class P1 extends A1 {
    int x;

    P1() {
        x = 20;
    }
    @Override
    void show() {
        System.out.println("P1 show");
    }
}

public class Bind {
    public static void main(String args[]) {
        A1 p = new P1();
        System.out.println(p.x);
        p.show();
    }
}
