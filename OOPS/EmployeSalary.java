import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class EmployeSalary {
    private ResourceBundle rb;
    EmployeSalary(){
        rb = ResourceBundle.getBundle("message", getLocale());
    }

    String readResourceBundle(String key){
        return rb.getString(key);
    }

    String properCase(String name){
        String[] list = name.split(" ");
        String finalName = "";

        for(String naam: list){
            char singleChar = naam.charAt(0);
            String temp = String.valueOf(singleChar).toUpperCase() + naam.substring(1).toLowerCase();
            finalName += temp + " ";
            
        }
        return finalName;
    }
    void printEmployeSalary(Employe emp){
        System.out.println("Date: " + dateFormat());
        System.out.println("Emp Name: " + properCase(emp.getName()));
        System.out.println(numberFormat(emp.getSalary()));
        System.out.println("*********************Dividation of salary************************");
        System.out.println("HRA: " + numberFormat(emp.hra()));
        System.out.println("DA: " + numberFormat(emp.da()));
        System.out.println("TA: " + numberFormat(emp.ta()));
        System.out.println("MA: " + numberFormat(emp.ma()));
        System.out.println("TAX: " + numberFormat(emp.tax()));
        System.out.println("GS: " + numberFormat(emp.gs())); 
        System.out.println("--------------------------------------------------------------");
        System.out.println("NS: " + numberFormat(emp.ns()));

    


    }
    
    Locale getLocale(){
        Locale locale = new Locale("hi","IN");
        return locale;

    }

    String dateFormat(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,getLocale());
        return dateFormat.format(date);
    }
    String numberFormat(double value){
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(getLocale());
        String formatedValue = nf.format(value);
        return formatedValue;
    }
}
