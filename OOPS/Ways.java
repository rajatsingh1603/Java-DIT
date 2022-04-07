
interface Calc{
    int compute(int a, int b);
}

// 1-way to implement interface.
class Z1 implements Calc{

    @Override
    public int compute(int x, int y){
        return x+y;
    }
}


public class Ways {
    public static void main(String args[]){
        //  

        //2nd method through making annonymous class

        // Calc c2 = new Calc() {

        //     @Override
        //     public int compute(int x, int y){
        //         return x+y;
        //     }
        // };  //because it is treated as a block

    //    System.out.println(c2.compute(500, 700)); 

    //3rd method - Lambda Expression

    Calc c2 = (a,b)-> a+b;
    System.out.println(c2.compute(500, 700)); 
    }
}
