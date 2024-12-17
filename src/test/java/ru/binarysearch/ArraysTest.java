package ru.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для тестирования реализации бинарного поиска Arrays.
 *
 * @author Никита Петрович Бородулин.
 */
class ArraysTest {

    public static final byte[] ARRAY_BYTE = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static final int[] ARRAY_INT = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static final long[] ARRAY_LONG = new long[]{1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L};
    public static final short[] ARRAY_SHORT = new short[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static final char[] ARRAY_CHAR = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    public static final double[] ARRAY_DOUBLE = new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0};
    public static final float[] ARRAY_FLOAT = new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.0f};
    public static final int NOT_FOUND_INDEX = -1;

    //<editor-fold desc="binary search byte">
    @Test
    void testBinarySearchByteFound() {
        // Given
        byte keyToFind = 5;
        int expectedIndex = 4;

        // When
        int result = Arrays.binarySearch(ARRAY_BYTE, keyToFind);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testBinarySearchByteFoundWithBoard() {
        // Given
        byte keyToFind = 5;
        int expectedIndex = 4;

        // When
        int result = Arrays.binarySearch(ARRAY_BYTE, 0, 5, keyToFind);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testBinarySearchByteNotFound() {
        // Given
        byte keyNotFound = 11;

        // When
        int result = Arrays.binarySearch(ARRAY_BYTE, keyNotFound);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }

    @Test
    void testBinarySearchByteNotFoundWithBoard() {
        // Given
        byte keyNotFound = 11;

        // When
        int result = Arrays.binarySearch(ARRAY_BYTE, 6, 7, keyNotFound);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }


    @Test
    void testBinarySearchFound() {
        // Given
        byte keyToFind = 5;
        int expectedIndex = 4;

        // When
        int result = Arrays.binarySearch(ARRAY_BYTE, 0, ARRAY_BYTE.length - 1, keyToFind);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testBinarySearchNotFound() {
        // Given
        byte keyNotFound = 11;

        // When
        int result = Arrays.binarySearch(ARRAY_BYTE, 0, ARRAY_BYTE.length - 1, keyNotFound);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }
    //</editor-fold>

    //<editor-fold desc="binary search char">
    @Test
    void testByteBinarySearchFound() {
        // Given
        char keyToFind = 'e';
        int expectedIndex = 4;

        // When
        int result = Arrays.binarySearch(ARRAY_CHAR, keyToFind);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testByteBinarySearchFoundBoard() {
        // Given
        char keyToFind = 'e';
        int expectedIndex = 4;

        // When
        int result = Arrays.binarySearch(ARRAY_CHAR, 0, 4, keyToFind);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testByteBinarySearchNotFound() {
        // Given
        char keyNotFound = 'z';

        // When
        int result = Arrays.binarySearch(ARRAY_CHAR, keyNotFound);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }

    @Test
    void testByteBinarySearchNotFoundBoard() {
        // Given
        char keyNotFound = 'z';

        // When
        int result = Arrays.binarySearch(ARRAY_CHAR, 0, 1, keyNotFound);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }
    //</editor-fold>

    //<editor-fold desc="binary search double">
    @Test
    void testDoubleBinarySearchFound() {
        // Given
        double keyToFind = 5.5;
        int expectedIndex = 4;

        // When
        int result = Arrays.binarySearch(ARRAY_DOUBLE, keyToFind);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testDoubleBinarySearchFoundBoard() {
        // Given
        double keyToFind = 5.5;
        int expectedIndex = 4;

        // When
        int result = Arrays.binarySearch(ARRAY_DOUBLE, 0, 5, keyToFind);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testDoubleBinarySearchNotFound() {
        // Given
        double keyNotFound = 11.1;

        // When
        int result = Arrays.binarySearch(ARRAY_DOUBLE, keyNotFound);

        //
        assertEquals(NOT_FOUND_INDEX, result);
    }

    @Test
    void testDoubleBinarySearchNotFoundBoard() {
        // Given
        double keyNotFound = 11.1;

        // When
        int result = Arrays.binarySearch(ARRAY_DOUBLE, 0, 3, keyNotFound);

        //
        assertEquals(NOT_FOUND_INDEX, result);
    }
    //</editor-fold>


    //<editor-fold desc="float binary search">
    @Test
    void testFloatBinarySearchFound() {
        // Given
        float key = 5.5f;
        int expectedIndex = 4;

        // When
        int result = Arrays.binarySearch(ARRAY_FLOAT, key);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testFloatBinarySearchFoundBoard() {
        // Given
        float key = 5.5f;
        int expectedIndex = 4;

        // When
        int result = Arrays.binarySearch(ARRAY_FLOAT, 0, 4, key);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testFloatBinarySearchNotFound() {
        // Given
        float key = 11.1f;

        // When
        int result = Arrays.binarySearch(ARRAY_FLOAT, 0, 2, key);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }
    //</editor-fold>

    //<editor-fold desc="int binary search">
    @Test
    void testIntBinarySearchFound() {
        // Given
        int key = 10;
        int expectedIndex = 9;

        // When
        int result = Arrays.binarySearch(ARRAY_INT, key);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testIntBinarySearchFoundBoard() {
        // Given
        int key = 10;
        int expectedIndex = 9;

        // When
        int result = Arrays.binarySearch(ARRAY_INT, 5, 9, key);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testIntBinarySearchNotFound() {
        // Given
        int key = 11;

        // When
        int result = Arrays.binarySearch(ARRAY_INT, 0, 2, key);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }
    //</editor-fold>

    //<editor-fold desc="long binary search">
    @Test
    void testLongBinarySearchFound() {
        // Given
        long key = 10;
        int expectedIndex = 9;

        // When
        int result = Arrays.binarySearch(ARRAY_LONG, key);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testLongBinarySearchFoundBoard() {
        // Given
        long key = 10;
        int expectedIndex = 9;

        // When
        int result = Arrays.binarySearch(ARRAY_LONG, 5, 9, key);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testLongBinarySearchNotFound() {
        // Given
        long key = 11;

        // When
        int result = Arrays.binarySearch(ARRAY_LONG, 0, 2, key);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }

    @Test
    void testLongBinarySearchNotFoundBoard() {
        // Given
        long key = 10;

        // When
        int result = Arrays.binarySearch(ARRAY_LONG, 0, 2, key);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }
    //</editor-fold>

    //<editor-fold desc="short binary search">
    @Test
    void testShortBinarySearchFound() {
        // Given
        short key = 10;
        int expectedIndex = 9;

        // When
        int result = Arrays.binarySearch(ARRAY_SHORT, key);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testShortBinarySearchFoundBoard() {
        // Given
        short key = 10;
        int expectedIndex = 9;

        // When
        int result = Arrays.binarySearch(ARRAY_SHORT, 5, 9, key);

        // Then
        assertEquals(expectedIndex, result);
    }

    @Test
    void testShortBinarySearchNotFound() {
        // Given
        short key = 11;

        // When
        int result = Arrays.binarySearch(ARRAY_SHORT, 0, 2, key);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }

    @Test
    void testShortBinarySearchNotFoundBoard() {
        // Given
        short key = 10;

        // When
        int result = Arrays.binarySearch(ARRAY_SHORT, 0, 2, key);

        // Then
        assertEquals(NOT_FOUND_INDEX, result);
    }
    //</editor-fold>


}