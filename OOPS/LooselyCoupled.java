interface IProducer{
    void show();
    void input();
}

class EnhancedProducer implements IProducer{

    @Override
    public void show() {
    
        System.out.println("EnProducer show");
        
    }

    @Override
    public void input() {
    
        System.out.println("EnProducer input");
    }
    
}
class Producer implements IProducer{

    @Override
    public void show() {
       System.out.println("Producer show");
        
    }

    @Override
    public void input() {
        System.out.println("Producer input");
        
    }

    public void notexpose1(){
        System.out.println("not exposed 1");
    }

    public void notexpose2(){
        System.out.println("not exposed 2");
    }
    
}

class Consumer1{
    void call(){
        IProducer p = new Producer();
        p.show();
        p.input();
        // p.notexpose1();
        // p.notexpose2();
    }

}

class Consumer2{
    void call(){
        IProducer p = new Producer();
        p.show();
        p.input();
        // p.notexpose1();
        // p.notexpose2();
    }

}

public class LooselyCoupled {
    public static void main(String args[]){
        Consumer1 c = new Consumer1();
        c.call();
        System.out.println("*******************************************");

        Consumer2 c2 = new Consumer2();
        c2.call();
    }
}
