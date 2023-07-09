import org.challenges.challengesString.ReversePhrase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReversePhraseTest {

    @Test
    public void testReversePhrase() {
        assertEquals("amazing. is OpenAI World! Hello,", ReversePhrase.reversePhrase("Hello, World! OpenAI is amazing."));
        assertEquals("string a is This", ReversePhrase.reversePhrase("This is a string"));
    }

    @Test
    public void testReversePhraseWithEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> ReversePhrase.reversePhrase(""));
    }



}
