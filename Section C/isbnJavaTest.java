import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ISBNValidatorTest {

    @Test
    public void testValidISBN10() {
        String isbn10 = "0330301624";
        String expected = "9780330301626";
        assertEquals(expected, ISBNValidator.validateISBN(isbn10));
    }

    @Test
    public void testValidISBN13() {
        String isbn13 = "9780316066525";
        String expected = "Valid";
        assertEquals(expected, ISBNValidator.validateISBN(isbn13));
    }

    @Test
    public void testInvalidISBN() {
        String invalidISBN = "033030162X";
        String expected = "Invalid";
        assertEquals(expected, ISBNValidator.validateISBN(invalidISBN));
    }
}
