package oop_projects;

public class Main {

	public static void main(String[] args) {
		School school = new School();

		Classroom classroom = new Classroom();
		Classroom classroom1 = new Classroom();
		Classroom classroom2 = new Classroom();

		school.add("Math", classroom);
		school.add("Swiming", classroom1);
		school.add("Art", classroom2);

		Student s1 = new Student("AHMED");
		Student s2 = new Student("YASSMIN");
		Student s3 = new Student("HIBA");
		Student s4 = new Student("YASSIN");
		Student s5 = new Student("ISMAIL");
		Student s6 = new Student("TATA");

		classroom.add(s1, 16.9);
		classroom.add(s2, 18.2);
		classroom1.add(s3, 20.0);
		classroom1.add(s4, 9.8);
		classroom2.add(s5, 13.1);
		classroom2.add(s6, 17.0);

		school.printAll();

	}

}
