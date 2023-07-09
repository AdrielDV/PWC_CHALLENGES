import org.example.ReverseString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {


    @Test
    public void testReverseString() {
        assertEquals("amazing. is OpenAI World! Hello,", ReverseString.reverseString("Hello, World! OpenAI is amazing."));
        assertEquals("string a is This", ReverseString.reverseString("This is a string"));
    }


}
