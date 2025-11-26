package oop_projects;

public class Main {

	public static void main(String[] args) {
		LibrarySystem librarySystem = new LibrarySystem();
		
		User u1 = new User("Luna Vega");
		User u2 = new User("Jackson Harlow");
		User u3 = new User("Sofia Quill");
		
		Book b1 = new Book("1984", "George Orwell");
		Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");
		Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
		Book b4 = new Book("One Hundred Years of Solitud", "Gabriel García Márquez");
		
		librarySystem.addUser(u1);
		librarySystem.addUser(u2);
		librarySystem.addUser(u3);

		librarySystem.addBook(b1);
		librarySystem.addBook(b2);
		librarySystem.addBook(b3);
		librarySystem.addBook(b4);
		
		librarySystem.borrowedBook(b4, u3);
		librarySystem.borrowedBook(b2, u3);
		librarySystem.borrowedBook(b1, u2);
		
		librarySystem.printAll();

		

	}

}
 