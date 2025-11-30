package oop_projects;

public class Main {
    public static void main(String[] args) {
        
        Library lib = new Library();

        // Create authors
        Author a1 = new Author("George Orwell");
        Author a2 = new Author("J.K. Rowling");
        Author a3 = new Author("J.R.R. Tolkien");

        // Create books
        Book b1 = new Book(a1, "1984");
        Book b2 = new Book(a2, "Harry Potter");
        Book b3 = new Book(a3, "The Hobbit");
        Book b4 = new Book(a1, "Animal Farm");

        // Add to library
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.addBook(b4);

        System.out.println("---- ALL BOOKS ----");
        lib.printAllBooks();

        System.out.println("\n---- BY AUTHOR: George Orwell ----");
        lib.findBooksByAuthor("George Orwell");

        System.out.println("\n---- REMOVE: 1984 ----");
        lib.removeBook("1984");

        System.out.println("\n---- ALL BOOKS (after removal) ----");
        lib.printAllBooks();

        System.out.println("\n---- SEARCH BY TITLE (Harry Potter) ----");
        Book found = lib.getBookByTitle("Harry Potter");
        if(found != null) System.out.println("Found -> " + found);
    }
}
