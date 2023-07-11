import org.challenges.challengesString.UppercaseLetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UppercaseLetterTest {



    @Test
    public void upperCaseFirstLetterTest(){

        assertEquals("Hello. How are you? I'm fine, thank you.", UppercaseLetter.upperCaseFirstLetter("hello. how are you? i'm fine, thank you."));
        assertEquals("Good night. I'm gonna sleep", UppercaseLetter.upperCaseFirstLetter("good night. i'm gonna sleep"));


    }
    @Test
    public void testUpperCaseFirstLetterWithEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> UppercaseLetter.upperCaseFirstLetter(""));
    }

}
