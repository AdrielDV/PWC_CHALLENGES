import org.challenges.challengesString.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {


    @Test
    public void testPalindrome(){


        assertEquals("bab", Palindrome.getPalindrome("babad"));
        assertEquals("level", Palindrome.getPalindrome("Next level"));
        assertEquals("Não tem palíndromo", Palindrome.getPalindrome("teste"));

    }
}
