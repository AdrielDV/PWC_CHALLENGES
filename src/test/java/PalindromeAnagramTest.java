import org.example.PalindromeAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeAnagramTest {


    @Test
    public void isAnagramOfPalindromeTest(){

        assertTrue(PalindromeAnagram.isAnagramOfPalindrome("racecar"));
        assertTrue(PalindromeAnagram.isAnagramOfPalindrome("carrace"));
        assertFalse(PalindromeAnagram.isAnagramOfPalindrome("hello"));

    }

}
