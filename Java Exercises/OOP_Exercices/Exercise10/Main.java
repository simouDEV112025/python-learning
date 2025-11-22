package oop_projects;

public class Main {

	public static void main(String[] args) {
		
		Author a = new Author("ismail", "japanese");
		Author b = new Author("jawad", "moorocan");
		Book book1 = new Book("Dune", 544, a);
		Book book2 = new Book("dark", 300, a);
		Book book3 = new Book("sun", 187, a);
		Book book4 = new Book("shadow", 102, b);
		Book book5 = new Book("earth", 1090, b);

		book1.printBookInfo();
		book2.printBookInfo();
		book3.printBookInfo();
		book4.printBookInfo();
		book5.printBookInfo();
				
	}
			
}
