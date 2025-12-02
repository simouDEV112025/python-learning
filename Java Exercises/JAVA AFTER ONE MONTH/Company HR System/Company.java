package oop_projects;

import java.lang.classfile.AnnotationValue.OfAnnotation;
import java.util.ArrayList;

public class Company {
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public void add(Employee e) {
		employees.add(e);
	}
	public void calculateTotalSalaries() {
		double totalSalarie = 0;
		for(Employee employee : employees) {
			if(employee instanceof Manager) {
				totalSalarie+=((Manager) employee).calculateBonus();
			}
			else {
				totalSalarie+=employee.getSalary();
			}
		}
		System.out.println("Total= "+totalSalarie);
	}
	public Employee getEmployeeByName(String name) {
		Employee e = null;
		for(Employee employee : employees) {
			if(employee.getName().equals(name)) {
				e=employee;
				break;
			}
		}
		return e;
	}
	public void promoteEmployee(String name, double bonus) {
		Employee e = getEmployeeByName(name);
		if(e==null) {
			System.out.println("Employee not found");
			return;
		}
		if(e instanceof Developer) {
				Manager manager = new Manager(e.getName(), e.getSalary(),bonus );
				employees.add(manager);
				employees.remove(e);
				return;
		}
		if(e instanceof Intern) {
			Developer developer = new Developer(e.getName(), e.getSalary());
			employees.add(developer);
			employees.remove(e);
			return;
		}
		else {
			System.out.println("Employee already a manager can not be promoted");
		}
	}
	public void findBestEmployee() {
		Employee bestEmployee = employees.get(0);
		double Salary=bestEmployee.getSalary();
		if( bestEmployee instanceof Manager) {
			Salary= ((Manager) employees.get(0)).calculateBonus();
		}
		for(int i=0; i<employees.size(); i++) {
			Employee current = employees.get(i);
			double currentSalary= current.getSalary();
			if(current instanceof Manager) {
				currentSalary = ((Manager) current).calculateBonus();
			}
			if (currentSalary>Salary) {
				Salary=currentSalary;
				bestEmployee=current;
			}
		}
		System.out.println("Best employee is: "+bestEmployee.getName());
		
	}

}
