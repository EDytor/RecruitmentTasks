package pl.EDytor;

import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {

    public Integer count(String input) {
        if (input.matches(".*\\d+.*")) {
            throw new RuntimeException();
        }
        Map<Character, Integer> letterCounts = new HashMap<>();
        for (char c : input.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }

        int referenceCount = -1;
        for (int count : letterCounts.values()) {
            if (referenceCount == -1) {
                referenceCount = count;
            } else if (count != referenceCount) {
                return 0;
            }
        }
        int result = 0;
        for (int count : letterCounts.values()) {
            result += count * count;
        }
        return result;
    }
}
