import org.challenges.challengesString.UppercaseLetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppercaseLetterTest {



    @Test
    public void upperCaseFirstLetterTest(){

        assertEquals("Hello. How Are You? I'm Fine, Thank You.", UppercaseLetter.upperCaseFirstLetter("hello. how are you? i'm fine, thank you."));
        assertEquals("It's Me, Adriel!", UppercaseLetter.upperCaseFirstLetter("it's me, adriel!"));


    }

}
