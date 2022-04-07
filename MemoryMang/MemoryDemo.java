import java.util.ArrayList;

class Student{
    long id; //2 bytes
    String name; //2 byte per char + refernce
    String course;

    Student(long id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }
}
public class MemoryDemo {
    public static void main(String args[]) throws InterruptedException{
        Student student;
        long i = 1;
        ArrayList<Student> list = new ArrayList<>();
        
        Runtime r = Runtime.getRuntime();
        System.out.println("Processors :: " + r.availableProcessors());
        System.out.println("Total Memory :: " + r.totalMemory() + "Free Memory :: " + r.freeMemory() + "Used Memory :: " + (r.totalMemory() - r.freeMemory()));
        System.out.println("Main Running...");
        // for(int i =0; i<Integer.MAX_VALUE; i++){
            while(i <= 1000){
                // Thread.sleep(50); //main will sleep for 50ms
            student = new Student(i,"Rajat" +i, "DSA" +i);
            list.add(student);
            i++;
        }

        System.out.println("Total Memory :: " + r.totalMemory() + "Free Memory :: " + r.freeMemory() + "Used Memory :: " + (r.totalMemory() - r.freeMemory()));
    }
}
