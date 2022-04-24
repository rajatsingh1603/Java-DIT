class Employe{
    int id;
    String name;

    Employe(int id, String name){
        this.id = id;
        this.name = name;
    }

    void print(){
        System.out.println(id + " " + name);
    }
    @Override
    protected void finalize(){
        System.out.println("Good Bye Employee...");
    }
}

public class GC {
    public static void main(String args[]){
        Employe e = new Employe(100, "rajat");
        e.print();
        e = null;
        System.gc(); //requesting gc to run
        System.out.println("Main ended...");
    }
}
