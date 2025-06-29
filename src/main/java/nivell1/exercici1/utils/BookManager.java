package nivell1.exercici1.utils;

import nivell1.exercici1.entities.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookManager {

    private List<Book> library = new ArrayList<>();


    public Book getLBookByIndex(int index) {
        return library.get(index);
    }

    public int getLibrarySize(){
        return this.library.size();
    }

    public List<Book> getLibrary(){
        return this.library;
    }

    public void addBooktoLibrary(Book newBook) {
        if(!this.library.contains(newBook)){
            this.library.add(newBook);
            this.library.sort(Comparator.comparing(Book::getTitle));
            System.out.println("Llibre afegit a la biblioteca correctament.");
        } else {
            System.out.println("Error. El llibre ja es troba a la biblioteca.");
        }

    }

    public void showAllListBooks() {
        System.out.println("\nTots els llibres:");
        for (Book book : library) {
            System.out.println("Titol: " + book.getTitle() + ", autor: " + book.getAuthor());
        }
    }

    public void setBookByIndex(int index, Book newBook) {
        this.library.add(index, newBook);
    }

    public void deleteBook(String title) {
        boolean deleteSuccessfully = false;
        for (int i = 0; i < library.size(); i++) {
            if (title.equalsIgnoreCase(library.get(i).getTitle())) {
                this.library.remove(i);
                this.library.sort(Comparator.comparing(Book::getTitle));

                System.out.println("\nEl llibre \"" + title + "\" ha estat eliminat correctament.");
                deleteSuccessfully = true;
                break;
            }
        }
        if (!deleteSuccessfully) {
            System.out.println("No s'ha pogut eliminar correctament.");
        }
    }
}
