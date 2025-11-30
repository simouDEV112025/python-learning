package oop_projects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	ArrayList<Person>persons =new  ArrayList<Person>();
    	
    	Person s1 = new Student("ISMAIL", 26, "Math");
    	Person s2 = new Student("YASSIN", 16, "p");
    	Person s3 = new Student("ISMAIL", 26, "ka");
    	
    	Person t1 = new Teacher("xia", 37, 39200);
    	Person t2 = new Teacher("ouso", 47, 10200);
    	Person t3 = new Teacher("kilo", 29, 20000);
    	
    	persons.add(t1);
    	persons.add(t2);
    	persons.add(t3);
    	persons.add(s1);
    	persons.add(s2);
    	persons.add(s3);

    	
    	for(Person person : persons) {
    		System.out.println(person);
    	}

    
       
    }
}
