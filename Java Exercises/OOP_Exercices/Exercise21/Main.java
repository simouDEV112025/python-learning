package oop_projects;

public class Main {

	public static void main(String[] args) {		
		Computer computer1 = new Computer(5.5 , 8, 129,"DDR5");
		Computer computer2 = new Computer(4.6 , 6, 12,"DDR4");
		Computer computer3 = new Computer(2.2 , 4, 4,"DDR3");

		User user = new User("ahmed");
		user.addComputer(computer2);
		user.addComputer(computer1);
		
		computer1.getRam().setSize(64);
		
		user.printAll();

	}

}
 