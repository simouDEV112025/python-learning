package oop_projects;

import java.util.HashMap;

public class School {
	private HashMap<String, Classroom> map = new HashMap<>();

	public void add(String className, Classroom classroom) {
		map.put(className, classroom);
	}

	public void remove(String className) {
		map.remove(className);
	}

	public Classroom getClassroom(String className) {
		return map.get(className);
	}

	public HashMap<String, Classroom> getMap() {
		return map;
	}

	public void printAll() {
		for (String n : map.keySet()) {
			System.out.println(n);
			map.get(n).printAll();

		}
	}
}
