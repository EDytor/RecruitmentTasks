package pl.EDytor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class BubbleSortTest {


    @Test
    void shouldReturnSortedListOfIntegers() {
        // Given
        Integer[] table = {1, 4, 5, 6, 8, 3, 8};
        List<Integer> unsortedList = new ArrayList<>(List.of(table));
        // When
        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> sortedList = bubbleSort.sort(unsortedList);
        // Then
        Assertions.assertEquals(3, sortedList.get(1));
        Assertions.assertEquals(8, sortedList.get(5));
    }


    @Test
    void shouldReturnSortedListOfDoubles() {
        // Given
        Double[] table = {-9.3, 0.2, 4.0, 0.1, 5.0, 9.0};
        List<Double> unsortedList = new ArrayList<>(List.of(table));
        // When
        BubbleSort bubbleSort = new BubbleSort();
        List<Double> sortedList = bubbleSort.sort(unsortedList);
        // Then
        Assertions.assertEquals(-9.3, sortedList.get(0));
        Assertions.assertEquals(9.0, sortedList.get(5));
    }

    @Test
    void shouldReturnSortedListOfDoublesWithoutNull() {
        // Given
        List<Double> unsortedList = new ArrayList<>();
        // When
        BubbleSort bubbleSort = new BubbleSort();
        unsortedList.add(null);
        unsortedList.add(5.0001);
        List<Double> sortedList = bubbleSort.sort(unsortedList);
        // Then
        Assertions.assertEquals(1, sortedList.size());
    }

    @Test
    void shouldThrowRuntimeException() {
        // Given
        List<Double> unsortedList = null;
        // When
        BubbleSort bubbleSort = new BubbleSort();
        // Then
        Assertions.assertThrows(RuntimeException.class, () -> bubbleSort.sort(unsortedList));
    }

}