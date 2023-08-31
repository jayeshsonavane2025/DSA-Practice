package practise;
import java.util.*;

public class LetterKeyPad {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }

        // Mapping of digits to corresponding letters
        String[] mapping = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        backtrack(digits, 0, mapping, new StringBuilder(), combinations);
        return combinations;
    }

    private void backtrack(String digits, int index, String[] mapping, StringBuilder currentCombination, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(currentCombination.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = mapping[digit - '0'];

        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);
            backtrack(digits, index + 1, mapping, currentCombination, combinations);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }
}