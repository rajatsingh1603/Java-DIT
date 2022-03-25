public class TestEmploye {
    public static void main(String args[]) {
        Employe amit = new Employe(101, "rAJAT siNgH JATAV", 100000);
        EmployeSalary employeSalary = new EmployeSalary();
        employeSalary.printEmployeSalary(amit);

    }

}
