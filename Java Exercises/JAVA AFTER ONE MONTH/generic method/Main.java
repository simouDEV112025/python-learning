package oop_projects;

public class Main {
	public static void main(String[] args) {
		print(new Integer[] { 1, 2, 3, 4 });
		print(new String[] { "ismail", "yassin", "hamza" });

	}

	public static <T> void print(T[] arr) {
		for (T t : arr) {
			System.out.print(t + " ");
		}
	}

}
