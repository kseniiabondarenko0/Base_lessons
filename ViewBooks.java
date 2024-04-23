package lesson26;

import java.util.ArrayList;

public class ViewBooks {
    public static void viewBooks(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", " + book.getYear());
        }
    }

}
