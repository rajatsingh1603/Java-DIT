

class Account {
    int id;
    String name;

    void roi() {
        System.out.println("Rate of intrest is 2%");
    }

    void print() {
        System.out.println("base class");
    }
}

class SavingAccount extends Account {
    @Override
    void roi() {
        super.roi(); // call parent
        System.out.println("Rate of intrest is 4%");
    }

    void getBal() {
        System.out.println("Hello I am from SA");
    }

}

class CurrentAccount extends Account {

    void roi() {

        System.out.println("Rate of intrest is 6%");
    }

}
class AccountCaller{
    void caller(Account account){
        account.roi();
        account.print();
        if(account instanceof SavingAccount){
            ((SavingAccount)account).getBal();  //downcasting
        }
    }
    
}

public class IS_A {
    public static void main(String args[]) {
        // SavingAccount sb = new SavingAccount();
        // sb.roi();
        // sb.print();

        // Account account = new SavingAccount(); // upcasting
        // account.roi();
        // account.print();
        // account = new CurrentAccount();
        // account.roi();
        // account.print();

        AccountCaller ac = new AccountCaller();
        ac.caller(new SavingAccount());
        ac.caller(new CurrentAccount());

       

    }

}
