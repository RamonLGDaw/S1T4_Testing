package nivell1.exercici1;

import nivell1.exercici1.exceptions.LibraryEmptyException;
import nivell1.exercici1.model.Book;
import nivell1.exercici1.model.Library;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        System.out.println("\nAfegir llibres a la biblioteca.");
        library.addBookToLibrary(new Book("La sombra del viento", "Carlos Ruiz Zafón"));
        library.addBookToLibrary(new Book("Marina", "Carlos Ruiz Zafón"));
        library.addBookToLibrary(new Book("Mecanoscrit del segon origen", "Manuel de Pedrolo"));

        System.out.println("\nMostrar tots els llibres de la biblioteca:");
        library.showAllBooks();

        System.out.println("\nIntent d'afegir un llibre que ja es troba a la biblioteca: ");
        library.addBookToLibrary(new Book("Marina", "Carlos Ruiz Zafón"));

        System.out.println("\nRecuper un llibre donat un índex: ");
        try {
            library.getTitleByIndex(4);
        } catch (LibraryEmptyException | IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nAfegir un llibre en una posició donada: ");
        library.addBookOnDeterminedPosition(1,"La volta al món en 80 dies","Jules Verne");

        System.out.println("\nMostrar tots els llibres de la biblioteca després d'afegir \" La volta al món en 80 dies\" en la segona posició:");
        library.showAllBooks();

        System.out.println("\nEliminar un llibre pel seu títol: ");
        library.removeBook("Marina");

        System.out.println("\nMostrar tots els llibres de la biblioteca després d'eliminar:  \" Marina\"");
        library.showAllBooks();

    }
}