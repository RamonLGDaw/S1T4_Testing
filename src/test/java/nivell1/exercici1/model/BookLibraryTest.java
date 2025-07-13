package nivell1.exercici1.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Tests per la gestió de llibres a la biblioteca")
public class BookLibraryTest {

    private Library library;
    private Book laSombraDelViento;
    private Book mecanoscritDelSegonOrigen;
    private Book marina;


    @BeforeEach
    public void setup() {
        library = new Library();
        laSombraDelViento = new Book("La sombra del viento", "Carlos Ruiz Zafón");
        mecanoscritDelSegonOrigen = new Book("Mecanoscrit del segon origen", "Manuel de Pedrolo");
        marina = new Book("Marina", "Carlos Ruiz Zafón");
    }


    @Test
    @DisplayName("Given library is created, when checked, then it should not be null")
    public void givenLibrary_whenCreated_thenNotNull() {
        assertNotNull(library);
    }


    @Test
    @DisplayName("Given books added, when size is checked, then it returns correct count")
    public void givenBooksAdded_whenGetLibrarySize_thenReturnsCorrectSize() {

        library.addBookToLibrary(laSombraDelViento);
        library.addBookToLibrary(marina);
        assertEquals(2, library.getLibrarySize());
    }


    @Test
    @DisplayName("Given books added, when accessed by index, then correct title is returned")
    public void givenBooksAdded_whenGetByIndex_thenReturnsExpectedBookTitle() {

        library.addBookToLibrary(laSombraDelViento);
        library.addBookToLibrary(mecanoscritDelSegonOrigen);

        assertEquals("Mecanoscrit del segon origen", library.getTitleByIndex(1));
    }


    @Test
    @DisplayName("Given duplicate book added, when checking size, then duplicates are not stored")
    public void givenDuplicateBook_whenAdded_thenIsNotStoredTwice() {

        library.addBookToLibrary(laSombraDelViento);
        library.addBookToLibrary(mecanoscritDelSegonOrigen);
        library.addBookToLibrary(mecanoscritDelSegonOrigen);

        assertEquals(2, library.getLibrarySize());
    }


    @Test
    @DisplayName("Given books added, when accessed by index, then correct books are returned")
    public void givenBooks_whenGetByIndex_thenReturnsCorrectTitles() {

        library.addBookToLibrary(laSombraDelViento);
        library.addBookToLibrary(mecanoscritDelSegonOrigen);

        assertEquals("La sombra del viento", library.getTitleByIndex(0));
        assertEquals("Mecanoscrit del segon origen", library.getTitleByIndex(1));
    }


    @Test
    @DisplayName("Given books added, when list is retrieved, then it contains correct books")
    public void givenBooksAdded_whenGetBooks_thenContainsCorrectList() {

        library.addBookToLibrary(laSombraDelViento);
        library.addBookToLibrary(marina);

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(laSombraDelViento);
        expectedList.add(marina);

        assertEquals(expectedList, library.getBooks());

        library.addBookToLibrary(mecanoscritDelSegonOrigen);

        expectedList.add(mecanoscritDelSegonOrigen);

        assertEquals(expectedList, library.getBooks());
    }


    @Test
    @DisplayName("Given a book removed, when checking size, then library size is updated")
    public void givenBookRemoved_whenChecked_thenLibrarySizeIsReduced() {

        library.addBookToLibrary(laSombraDelViento);
        library.addBookToLibrary(mecanoscritDelSegonOrigen);

        library.removeBook("Mecanoscrit del segon origen");

        assertEquals(1, library.getLibrarySize());

    }

    @Test
    @DisplayName("Given books added, when sorted, then list is ordered alphabetically")
    public void givenBooksAdded_whenSorted_thenListIsAlphabeticallyOrdered() {

        library.addBookToLibrary(mecanoscritDelSegonOrigen);
        library.addBookToLibrary(laSombraDelViento);
        library.addBookToLibrary(marina);

        assertEquals("La sombra del viento", library.getTitleByIndex(0));
        assertEquals("Marina", library.getTitleByIndex(1));
        assertEquals("Mecanoscrit del segon origen", library.getTitleByIndex(2));

    }

    @Test
    @DisplayName("Given books removed, when sorted, then list remains alphabetically ordered")
    public void givenBookRemoved_whenSorted_thenListRemainsOrdered() {

        library.addBookToLibrary(laSombraDelViento);
        library.addBookToLibrary(mecanoscritDelSegonOrigen);
        library.addBookToLibrary(marina);

        library.removeBook("Marina");

        assertEquals("La sombra del viento", library.getTitleByIndex(0));
        assertEquals("Mecanoscrit del segon origen", library.getTitleByIndex(1));


    }

}
