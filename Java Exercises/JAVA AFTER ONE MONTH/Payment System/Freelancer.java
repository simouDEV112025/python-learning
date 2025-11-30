package oop_projects;

public class Freelancer implements Payable {
	private String name;
	private double ratePerProject;
	private int numberOfProjects;

	public Freelancer(String name, double ratePerProject, int numberOfProjects) {
		this.name = name;
		this.ratePerProject = ratePerProject;
		this.numberOfProjects = numberOfProjects;
	}
	
	public double calculatePayment() {
		return ratePerProject*numberOfProjects;
	};
	@Override
	public String toString() {
		return this.name+" payment: "+calculatePayment()+"dh";
	}

}
