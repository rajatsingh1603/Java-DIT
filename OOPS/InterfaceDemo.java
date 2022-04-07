import java.util.List;

interface DBoperations{
    boolean create();
    List read();
}

class MySql implements DBoperations{

    @Override
    public boolean create() {
        System.out.println("hello i am a abstract function");
        return true;
    }

    @Override
    public List read() {
        
        return null;
    }
    
}

public class InterfaceDemo {
    public static void main(String args []){
        MySql mySql = new MySql();
        mySql.create();
    }
}
