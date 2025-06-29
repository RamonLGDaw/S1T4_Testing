package nivell1.exercici1.utils;

import nivell1.exercici1.entities.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookManagerTest {

    private BookManager biblioteca;
    private Book laSombreDelViento;
    private Book mecanoscritDelSegonOrigen;
    private Book marina;


    @BeforeEach
    public void setup() {
        biblioteca = new BookManager();
        laSombreDelViento = new Book("La sombre del viento", "Carlos Ruiz Zafón");
        mecanoscritDelSegonOrigen = new Book("Mecanoscrit del segon origen", "Manuel de Pedrolo");
        marina = new Book("Marina", "Carlos Ruiz Zafón");
    }


    @Test
    public void bookManageNotNull() {
        BookManager biblioteca = new BookManager();
        assertNotNull(biblioteca);

    }


    @Test
    public void libraryListSizeReturnsCorrectSize() {


        biblioteca.addBooktoLibrary(laSombreDelViento);

        assertEquals(1, biblioteca.getLibrarySize());
    }



    @Test
    public void containsEspecificBookInEspecificIndex() {

        biblioteca.addBooktoLibrary(laSombreDelViento);
        biblioteca.addBooktoLibrary(mecanoscritDelSegonOrigen);


        assertEquals(mecanoscritDelSegonOrigen, biblioteca.getLBookByIndex(1));
    }

    @Test
    public void checkNoDuplicateBooks() {

        Set<Book> hashSetLibrary = new HashSet<>();

        biblioteca.addBooktoLibrary(laSombreDelViento);
        biblioteca.addBooktoLibrary(mecanoscritDelSegonOrigen);

        hashSetLibrary.addAll(biblioteca.getLibrary());

        assertEquals(biblioteca.getLibrary().size(), hashSetLibrary.size());
    }


    @Test
    public void getBookByIndex_returnsExpectedBooks() {

        biblioteca.addBooktoLibrary(laSombreDelViento);
        biblioteca.addBooktoLibrary(mecanoscritDelSegonOrigen);

        assertEquals("La sombre del viento", biblioteca.getLBookByIndex(0).getTitle());
        assertEquals("Mecanoscrit del segon origen", biblioteca.getLBookByIndex(1).getTitle());
    }


    @Test
    public void checkAddBookReturnsCorrectList() {

        biblioteca.addBooktoLibrary(laSombreDelViento);
        biblioteca.addBooktoLibrary(marina);

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(laSombreDelViento);
        expectedList.add(marina);

        assertEquals(expectedList, biblioteca.getLibrary());

        biblioteca.addBooktoLibrary(mecanoscritDelSegonOrigen);

        expectedList.add(mecanoscritDelSegonOrigen);

        assertEquals(expectedList, biblioteca.getLibrary());
    }


    @Test
    public void deleteBookReturnsCorrectListSize() {


        biblioteca.addBooktoLibrary(laSombreDelViento);
        biblioteca.addBooktoLibrary(mecanoscritDelSegonOrigen);

        biblioteca.deleteBook("Mecanoscrit del segon origen");

        assertEquals(1, biblioteca.getLibrarySize());

    }

    @Test
    public void correctLIstOrderAfterAddNewBookOrDeleteABook() {

        biblioteca.addBooktoLibrary(laSombreDelViento);
        biblioteca.addBooktoLibrary(mecanoscritDelSegonOrigen);
        biblioteca.addBooktoLibrary(marina);

        List<Book> expectedList = new ArrayList<>();

        expectedList.add(laSombreDelViento);
        expectedList.add(marina);
        expectedList.add(mecanoscritDelSegonOrigen);

        assertEquals(expectedList, biblioteca.getLibrary());

        biblioteca.deleteBook("Marina");

        expectedList.remove(marina);

        assertEquals(expectedList, biblioteca.getLibrary());

    }

}
