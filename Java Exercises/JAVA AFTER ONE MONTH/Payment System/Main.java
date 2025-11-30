package oop_projects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	ArrayList<Payable>payables = new ArrayList<Payable>();
    	Payable hourlyEmployee = new HourlyEmployee("HAMZA", 300, 13);
    	Payable salariedEmployee = new SalariedEmployee("KAMAL", 12000);
    	Payable freelancer = new Freelancer("JAWAD", 6000, 1);
    	
    	payables.add(freelancer);
    	payables.add(salariedEmployee);
    	payables.add(hourlyEmployee);
    	
   for(Payable payable : payables) {
	   System.out.println(payable);
   }
   
       
    }
}
