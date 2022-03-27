
class GP{
    int x;
    GP(){
        x = 10;
    }
}

class P extends GP{
    int x;
    // P(int x){

    // }
}

class C extends P{
    int x = 2;
    C(int x){
        // super(x);
        int z = this.x + ((P)this).x + ((GP)this).x + x;
        System.out.println(((P)this).x);
        System.out.println("z: "+z);
    }
}
public class SuperandThis {
    public static void main(String args []){
        C c = new C(10);
    }
}
