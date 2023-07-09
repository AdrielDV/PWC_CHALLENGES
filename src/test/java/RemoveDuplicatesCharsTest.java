import org.challenges.challengesString.RemoveDuplicatesChars;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesCharsTest {


    @Test
    public void removeDuplicatesTest() {

        assertEquals("Helo, Wrd!", RemoveDuplicatesChars.duplicateRemover("Hello, World!"));
        assertEquals("AaBbc!", RemoveDuplicatesChars.duplicateRemover("AaaBbbc!!"));


    }
}
