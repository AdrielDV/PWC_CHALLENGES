# PWC_CHALLENGES
Projeto de desafios de manipulação de strings para entrevista de emprego na renomada empresa PWC. Inclui implementações de vários métodos para resolver os desafios, bem como testes unitários e um executável para testar todos os desafios em uma tela.


# Meu Projeto

Este projeto contém vários métodos úteis para manipulação de strings e seus respectivos testes unitários.

## Menu

- [Métodos](#métodos)
  - [reversePhrase](#reversephrase)
    - [Testes unitários para reversePhrase](#testes-unitários-para-reversephrase)
  - [duplicateRemover](#duplicateremover)
    - [Testes unitários para duplicateRemover](#testes-unitários-para-duplicateremover)
  - [getPalindrome](#getpalindrome)
    - [Testes unitários para getPalindrome](#testes-unitários-para-getpalindrome)
  - [upperCaseFirstLetter](#uppercasefirstletter)
    - [Testes unitários para upperCaseFirstLetter](#testes-unitários-para-uppercasefirstletter)
  - [isAnagramOfPalindrome](#isanagramofpalindrome)
    - [Testes unitários para isAnagramOfPalindrome](#testes-unitários-para-isanagramofpalindrome)

## Métodos

### reversePhrase

Este método recebe uma string como entrada e retorna a string com as palavras invertidas.

```java
public static String reversePhrase(String input) {
    if (input.length() == 0) {
        throw new IllegalArgumentException("A entrada não pode ter menos de 1 char");
    }
    String[] words = input.split(" ");
    ArrayUtils.reverse(words);
    return String.join(" ", words);
}
```

#### Testes unitários para reversePhrase

```java
@Test
public void testReversePhrase() {
    assertEquals("amazing. is OpenAI World! Hello,", ReversePhrase.reversePhrase("Hello, World! OpenAI is amazing."));
    assertEquals("string a is This", ReversePhrase.reversePhrase("This is a string"));
}

@Test
public void testReversePhraseWithEmptyInput() {
    assertThrows(IllegalArgumentException.class, () -> ReversePhrase.reversePhrase(""));
}
```

### duplicateRemover

Este método recebe uma string como entrada e retorna a string com caracteres duplicados removidos.

```java
public static String duplicateRemover(String input) {
    if (input.length() == 0) {
        throw new IllegalArgumentException("A entrada não pode ter menos de 1 char");
    }
    StringBuilder output = new StringBuilder();
    Arrays.stream(input.split("")).distinct().forEach(output::append);
    return output.toString();
}
```

#### Testes unitários para duplicateRemover

```java
@Test
public void removeDuplicatesTest() {
    assertEquals("Helo, Wrd!", RemoveDuplicatesChars.duplicateRemover("Hello, World!"));
    assertEquals("AaBbc!", RemoveDuplicatesChars.duplicateRemover("AaaBbbc!!"));
    assertEquals("123", RemoveDuplicatesChars.duplicateRemover("112233"));
}

@Test
public void testDuplicateRemoverWithEmptyInput() {
    assertThrows(IllegalArgumentException.class, () -> RemoveDuplicatesChars.duplicateRemover(""));
}
```

### getPalindrome

Este método recebe uma string como entrada e retorna o maior palíndromo encontrado na string.

```java
public static String getPalindrome(String input) {
    if (input.length() == 0) {
        throw new IllegalArgumentException("A entrada não pode ter menos de 1 char");
    }
    return IntStream.range(0, input.length())
            .boxed()
            .flatMap(i -> IntStream.rangeClosed(i + 1, input.length()).mapToObj(j -> input.substring(i, j)))
            .filter(substring -> substring.length() > 0)
            .filter(substring -> new StringBuilder(substring).reverse().toString().equals(substring))
            .max(Comparator.comparingInt(String::length))
            .orElse("Não tem palíndromo");
}
```

#### Testes unitários para getPalindrome

```java
@Test
public void testPalindrome(){
    assertEquals("bab", Palindrome.getPalindrome("babad"));
    assertEquals("level", Palindrome.getPalindrome("Next level"));
    assertEquals("Não tem palíndromo", Palindrome.getPalindrome("teste"));
}

@Test
public void testGetPalindromeWithEmptyInput() {
    assertThrows(IllegalArgumentException.class, () -> Palindrome.getPalindrome(""));
}
```

### upperCaseFirstLetter

Este método recebe uma string como entrada e retorna a string com a primeira letra de cada inicio de frase em maiúscula.

```java
    public static String upperCaseFirstLetter(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException("A entrada não pode ter menos de 1 char");
        }

        String[] sentences = input.split("(?<=[.!?])\\s+");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].substring(0, 1).toUpperCase() + sentences[i].substring(1);
        }
        return String.join(" ", sentences);
    }
```

#### Testes unitários para upperCaseFirstLetter

```java
@Test
public void upperCaseFirstLetterTest(){

 assertEquals("Hello. How are you? I'm fine, thank you.", UppercaseLetter.upperCaseFirstLetter("hello. how are you? i'm fine, thank you."));
 assertEquals("Good night. I'm gonna sleep", UppercaseLetter.upperCaseFirstLetter("good night. i'm gonna sleep"));

}

@Test
public void testUpperCaseFirstLetterWithEmptyInput() {
    assertThrows(IllegalArgumentException.class, () -> UppercaseLetter.upperCaseFirstLetter(""));
}
```

### isAnagramOfPalindrome

Este método recebe uma string como entrada e retorna verdadeiro se a string for um anagrama de um palíndromo, caso contrário, retorna falso.

```java
public static boolean isAnagramOfPalindrome(String input) {
    if (input.length() == 0) {
        throw new IllegalArgumentException("A entrada não pode ter menos de 1 char");
    }
    return input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
            .values()
            .stream()
            .filter(count -> count % 2 == 1)
            .count() <= 1;
}
```

#### Testes unitários para isAnagramOfPalindrome

```java
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
```


