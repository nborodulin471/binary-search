package ru.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {

    public static final List<Integer> TEST_DATA = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    public static final int NOT_FOUND_INDEX = -1;

    @Test
    void testBinarySearch() {
        // Given
        Integer keyNotFound = 5;
        int expectedIndex = 4;

        // When
        var result =  Collections.binarySearch(TEST_DATA, keyNotFound);

        // Then
        assertEquals(expectedIndex, result);
    }


    @Test
    void testBinarySearchNotfound() {
        // Given
        Integer keyNotFound = 11;

        // When
        var result =  Collections.binarySearch(TEST_DATA, keyNotFound);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }

    @Test
    void testBinarySearch_comparator() {
        // Given
        Integer keyNotFound = 5;
        int expectedIndex = 4;
        Comparator<Integer> comparator = Integer::compareTo;

        // When
        var result =  Collections.binarySearch(TEST_DATA, keyNotFound, comparator);

        // Then
        assertEquals(expectedIndex, result);
    }


    @Test
    void testBinarySearchNotfound_comparator() {
        // Given
        Integer keyNotFound = 11;
        Comparator<Integer> comparator = Integer::compareTo;

        // When
        var result =  Collections.binarySearch(TEST_DATA, keyNotFound, comparator);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }

}