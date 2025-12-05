package oop_projects;

import java.util.HashMap;

public class Classroom {
	private HashMap<Student, Double> map = new HashMap<>();

	public void add(Student s, Double score) {
		map.put(s, score);
	}

	public void remove(Student s) {
		map.remove(s);
	}

	public void updateScore(Student s, Double newScore) {
		map.replace(s, newScore);
	}

	public Double getScore(Student s) {
		return map.get(s);
	}

	public HashMap<Student, Double> getMap() {
		return map;
	}

	public void printAll() {
		for (Student student : map.keySet()) {
			System.out.println(student + " score: " + getScore(student));
		}
	}

}
