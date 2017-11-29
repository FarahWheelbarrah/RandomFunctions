import java.util.LinkedList;

public class WordCharacterAdd {
    private static final char[] ALPHABET_ARRAY = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    
    public static void main(String[] args) {
        System.out.println("Word value: " + wordValue(readString("Enter word: ").trim()));
    }
    
    private static int wordValue(String word) {
        LinkedList<Character> alphabetList = new LinkedList<>();
        for (char letter : ALPHABET_ARRAY)
            alphabetList.add(letter);
        int wordValue = 0;
        for (int i = 0; i < word.length(); i++)
            // if (alphabetList.contains(word.charAt(i))) // can either include or not include this statement; program will produce the same output in both cases
                wordValue += alphabetList.indexOf(word.charAt(i)) + 1;
        return wordValue;
    }
    
    // another way of doing it with the array only:
    // private static int wordValue(String word) {
    //     char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    //     int wordValue = 0;
    //     for (int i = 0; i < word.length(); i++)
    //         for (int j = 0; j < alphabet.length; j++)
    //             if (word.charAt(i) == alphabet[j])
    //                wordValue += j + 1;
    //     return wordValue;
    // }
    
    public static String readString(String prompt) {
        System.out.print(prompt);
        return In.nextLine();
    }
}
