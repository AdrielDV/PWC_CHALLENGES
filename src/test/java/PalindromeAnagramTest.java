import org.challenges.challengesString.PalindromeAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeAnagramTest {


    @Test
    public void isAnagramOfPalindromeTest(){

        assertTrue(PalindromeAnagram.isAnagramOfPalindrome("racecar"));
        assertTrue(PalindromeAnagram.isAnagramOfPalindrome("carrace"));
        assertFalse(PalindromeAnagram.isAnagramOfPalindrome("hello"));
        assertFalse(PalindromeAnagram.isAnagramOfPalindrome("abcde"));
        assertFalse(PalindromeAnagram.isAnagramOfPalindrome("ABCDE"));
        assertFalse(PalindromeAnagram.isAnagramOfPalindrome("12345"));

    }

    @Test
    public void testIsAnagramOfPalindromeWithEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> PalindromeAnagram.isAnagramOfPalindrome(""));
    }

}
