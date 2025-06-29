package nivell1.exercici1;

import nivell1.exercici1.entities.Book;
import nivell1.exercici1.utils.BookManager;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Book laSombreDelViento = new Book("La sombre del viento","Carlos Ruiz Zafón" );
        Book marina = new Book("Marina","Carlos Ruiz Zafón" );
        Set<Book> hashSetLibrary = new HashSet<>();

        BookManager biblioteca = new BookManager();

        biblioteca.addBooktoLibrary(laSombreDelViento);
        biblioteca.addBooktoLibrary(laSombreDelViento);

        for(Book book: biblioteca.getLibrary()){
            System.out.println("-" + book);
        }

        biblioteca.addBooktoLibrary(marina);

        for(Book book: biblioteca.getLibrary()){
            System.out.println("-" + book);
        }

        biblioteca.deleteBook("Marina");

        for(Book book: biblioteca.getLibrary()){
            System.out.println("-" + book);
        }
    }
}