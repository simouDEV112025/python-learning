package oop_projects;

public class Computer {
	private RAM ram;
	private CPU cpu;
	
	public Computer(double speed, int cores, int size, String type) {
		this.ram = new RAM(size, type);
		this.cpu = new CPU(speed, cores);
	}
	public RAM getRam() {
		return this.ram;
	}
	@Override
	public String toString() {
		return this.ram.getSize()+"ram, type "+this.ram.getType()+" and a cpu that reaches "
				   +this.cpu.getSpeed()+"ghz that has "+this.cpu.getCores()+" cores.";
	}

}
