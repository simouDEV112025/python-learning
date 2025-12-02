package oop_projects;

public class Main {
    public static void main(String[] args) {
        
        Company c = new Company();
        
        c.add(new Developer("Alice", 5000));
        c.add(new Manager("Bob", 6000, 2000));
        c.add(new Intern("Charlie", 2000, 6));
        
        c.calculateTotalSalaries();
        
        System.out.println(c.getEmployeeByName("Alice").getName());
        
        c.promoteEmployee("Charlie", 0); 
        // Intern -> Developer
        
        c.promoteEmployee("Alice", 1500); 
        // Developer -> Manager
        
        c.calculateTotalSalaries();
        
        c.findBestEmployee();
    }
}
