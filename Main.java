package lesson26;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(1, "The Catcher in the Rye", "J.D. Salinger", 1951));
        library.addBook(new Book(2, "The Dune",   "Frank Herbert", 1969));
        ViewBooks.viewBooks(library.getBooks());
    }
}
