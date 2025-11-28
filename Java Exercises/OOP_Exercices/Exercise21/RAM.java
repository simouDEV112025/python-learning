package oop_projects;

public class RAM {
	private int size;
	private String type;

	public RAM( int size, String type) {
		this.size = size;
		this.type = type;
	}
	public int getSize() {
		return this.size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return this.type;
	}
}
