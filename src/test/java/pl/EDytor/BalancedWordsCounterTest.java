package pl.EDytor;

import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.Test;

class BalancedWordsCounterTest {

    BalancedWordsCounter counter = new BalancedWordsCounter();

    @Test
    void shouldReturnNumberOfBalancedSubwords() {
        String input = "aabbcbcccbaa";
        Assertions.assertEquals(48, counter.count(input));
    }

    @Test
    void shouldReturnZeroWhenInputIsEmpty() {
        String input = "";
        Assertions.assertEquals(0, counter.count(input));
    }

    @Test
    void shouldThrowExceptionWhenThereIsADigit() {
        String input = "abababa1";
        Assertions.assertThrows(RuntimeException.class, () -> counter.count(input));
    }


}