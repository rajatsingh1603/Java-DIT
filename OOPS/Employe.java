public class Employe {
    private int id;
    private String name;
    private double salary;
    private String phone;
    private String city;
    private String email;
    private String manager;
    private String pincode;
    private String depName;
    // private final String COMPANY_NAME;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getManager() {
        return this.manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getPincode() {
        return this.pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDepName() {
        return this.depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public double hra(){
        return salary*0.50;
    }

    public double da(){
        return salary*0.15;
    }

    public double ta(){
        return salary*0.20;
    }

    public double ma(){
        return salary*0.20;
    }

    public double pf(){
        return salary*0.5;
    }

    public double gs(){
        double gross = salary + hra() + da() + ta() + ma() + pf();
        return gross;
    }


    public double tax(){
        double gsalary = gs();
        if(gsalary >= 900000){
            return 0.30;
        }
        else if(gsalary <900000 && gsalary >= 600000){
            return 0.20;
        }

        else if(gsalary <600000 && gsalary >= 400000){
            return 0.10;
        }
        else{
            return 0.0; //no taxation
        }

    }

    public double ns(){
        double tax = gs()*tax();
        return gs() - tax - pf();
    }

    // public String getCOMPANY_NAME() {
    //     return this.COMPANY_NAME;
    // }

    



   public void takeInput(int id, String name, double salary){
       if(id < 0 || salary < 0){
           System.out.println("Invalid Input..");
           return;
       }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //constructor - for initializing instance variable

    Employe(){
        System.out.println("Default Cons. Invoked");
        id = 0;
        name = " ";
        salary = 0.0;

    }

    Employe(int id, String name){
        this();
        System.out.println("Constructor 3 called");
    }

    //parametrized constructor

    Employe(int id, String name, double salary){
        // this(); //constructor chaining
        this(id,name);
        System.out.println("Constructor 2 called");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

    
}
