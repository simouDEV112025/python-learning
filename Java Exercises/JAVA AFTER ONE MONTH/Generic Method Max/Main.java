package oop_projects;

public class Main {
	public static void main(String[] args) {

		Integer max = max(10, 18);
		System.out.println(max);
	}

	public static <T extends Comparable<T>> T max(T a, T b) {
		return a.compareTo(b) >= 0 ? a : b;
	}

}
