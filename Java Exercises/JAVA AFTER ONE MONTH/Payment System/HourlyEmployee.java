package oop_projects;

public class HourlyEmployee implements Payable {
	private String name;
	private double hourlyRate;
	private int hoursWorked;
	
	public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	
	public double calculatePayment() {
		return hourlyRate*hoursWorked;
	};
	@Override
	public String toString() {
		return this.name+" payment: "+calculatePayment()+"dh";
	}

}
