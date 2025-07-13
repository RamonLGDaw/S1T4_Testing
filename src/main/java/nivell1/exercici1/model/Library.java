package nivell1.exercici1.model;

import nivell1.exercici1.exceptions.LibraryEmptyException;

import java.util.*;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }


    public  List<Book> getBooks() {
        return books;
    }


    public int getLibrarySize(){
        return this.books.size();
    }


    public void sortBooks(){
        books.sort(Comparator.comparing(Book::getTitle));
    }


    public boolean addBookToLibrary(Book book) {
        if (books.contains(book)) {
            System.out.println("Aquest títol ja es troba a la biblioteca: " + book.getTitle() + ", de l'autor: " + book.getAuthor());
            return false;
        }

        books.add(book);
        sortBooks();
        System.out.println("\tAfegit correctament: " + book.getTitle());
        return true;
    }


    public void showAllBooks() {
        for(Book book: books){
            System.out.println("\tTítol: " + book.getTitle() + ", Autor: " + book.getAuthor());
        }
    }


    public String getTitleByIndex(int index) {
        if (books.isEmpty()) {
            throw new LibraryEmptyException("La llibrería està buida.");
        }
        if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("Posició no válida, fora de rang: " + index);
        }

        Book book = books.get(index);
        System.out.println("El llibre a la posición " + index + " es: " + book);
        return book.getTitle();
    }


    public void addBookOnDeterminedPosition(int position, String title, String author) {
        Book newBook = new Book(title, author);
        try {
            if (this.books == null) {
                throw new IllegalStateException("La llista de llibres no ha estat inicialitzada.");
            }
            if (position < 0 || position > this.books.size()) {
                throw new IndexOutOfBoundsException("Posició fora de rang: " + position);
            }
            this.books.add(position, newBook);
        } catch (IllegalStateException | IndexOutOfBoundsException e) {
            System.out.println("Error: , " + e.getMessage());
        }
    }


    public boolean removeBook(String title) {
        Iterator<Book> booksIterator = books.iterator();
        while (booksIterator.hasNext()) {
            Book book = booksIterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                booksIterator.remove();
                sortBooks();
                System.out.println("Llibre eliminat: " + title);
                return true;
            }
        }
        System.out.println("Llibre no trobat: " + title);
        return false;
    }

}