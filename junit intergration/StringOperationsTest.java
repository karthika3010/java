import static org.junit.Assert.*;
import org.junit.Test;

public class StringOperationsTest
{
    StringOperations op = new StringOperations();

    @Test
    public void testLength()
    {
        assertEquals(5, op.getLength("Hello"));
    }

    @Test
    public void testReverse()
    {
        assertEquals("olleH", op.reverse("Hello"));
    }

    @Test
    public void testUppercase()
    {
        assertEquals("HELLO", op.toUpper("hello"));
    }
}