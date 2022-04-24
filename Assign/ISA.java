class A{

    int x;
 A(){
     System.out.println("Grand Parent Const");
 }

 A(int x){  //constructor overloading 
     this();
     System.out.println("Parametrized Const of Grand Parent");
 }
}

class B extends A{
    int x;
    B(){
        System.out.println("Parent Const");
    }

    B(int x){  //constructor overloading
        super(2); // call parametrized constructor of A 
        System.out.println("Parent Parametrized Const");
    }
}

class C extends B{
    int x ;
    C(){
        System.out.println("Child Const");
    }
    C(int x){
        super(3); //call parametrized constructor of B
        int z = this.x + ((B)this).x + ((A)this).x + x;
        System.out.println("Child Parametrized Const" + z);
    }
    static int a,b;
    static{   //static block to initialize static things
        a = 10;
        b = 20;
    }

    {  //instance block to initialize instance variable , pre constructor call
        x = 500;
    }



}


public class ISA {
    public static void main(String args[]){
        C c = new C(2);
    }
}
