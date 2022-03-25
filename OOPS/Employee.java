public class Employee {
    private int id;
    private String name;
    private double salary;
    private double hra;
    private double da;
    private double ta;
    private double ma;
    private double pf;
    private double gs;
    private double as;
    private double tax;

    public void takeInput(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hra = (salary * 50) / 100;
        this.da = (salary * 15) / 100;
        this.ta = (salary * 20) / 100;
        this.ma = (salary * 20) / 100;
        this.pf = (2 * (salary * 5) / 100);
        this.gs = hra + da + ta + ma + pf;
        this.as = 12 * gs;
        if (as > 500000) {
            this.tax = (10 * as) / 100;
        }
        if (as > 700000) {
            this.tax = (20 * as) / 100;
        }
        if (as > 900000) {
            this.tax = (30 * as) / 100;
        }
        

    }

    

    public void printSalary() {
        System.out.println("Emp Id : " + id);
        System.out.println("Emp Name : " + name);
        System.out.println("Emp Basic Salary : " + salary);
        System.out.println("Emp hra : " + hra);
        System.out.println("Emp da : " + da);
        System.out.println("Emp ta : " + ta);
        System.out.println("Emp ma : " + ma);
        System.out.println("Emp pf : " + pf);
        System.out.println("Emp gs : " + gs);
        System.out.println("Emp as : " + as);
        System.out.println("Tax : " + tax);

    }

}
