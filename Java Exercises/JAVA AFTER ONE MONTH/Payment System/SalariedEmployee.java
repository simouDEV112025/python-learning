package oop_projects;

public class SalariedEmployee implements Payable {
	private String name;
	private double monthlySalary;

	public SalariedEmployee(String name, double monthlySalary) {
		this.name=name;
		this.monthlySalary=monthlySalary;
	}
	
	public double calculatePayment() {
		return this.monthlySalary;
	};
	@Override
	public String toString() {
		return this.name+" payment: "+calculatePayment()+"dh";
	}

}
