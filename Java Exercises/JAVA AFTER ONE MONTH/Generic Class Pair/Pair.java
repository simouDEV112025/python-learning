package oop_projects;

public class Pair <T, U>{
	T item1;
	U item2;
	public Pair(T item1, U item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	public T getT() {
		return this.item1;
	}
	public U getU() {
		return this.item2;
	}

}
