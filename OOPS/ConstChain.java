class A1{
    int x;
    A1(){
        System.out.println("A1 Default Const.");
    }
    A1(int x){
        this(); //calling own class default constructor
        System.out.println("Parametrized Const.");
        this.x = x;
    }
}

class B1 extends A1{
        B1(){
            // internally call of super(); which will call parent default const.
            super(2); // call parent parametrized constructor
            int y = x+10;
            System.out.println("B1 Default Const " + y);
        }
}
public class ConstChain {
    public static void main(String args[]){
        B1 b1 = new B1(); //default const call of b1
    }
}
