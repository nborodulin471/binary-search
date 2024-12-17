package ru.binarysearch;

import java.util.Comparator;
import java.util.List;


/**
 * Учебная реализация методов бинарного поиска для коллекций.
 *
 * @author Никита Петрович Бородулин.
 */
public class Collections {

    private Collections() {
    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            T midValue = list.get(mid);

            // Проверяем, равен ли ключ среднему элементу
            if (midValue.equals(key)) {
                return mid; // Найден элемент
            } else if (midValue.compareTo(key) < 0) {
                left = mid + 1; // Ищем в правой половине
            } else {
                right = mid - 1; // Ищем в левой половине
            }
        }

        return -1; // Если элемент не найден, возвращаем -1
    }

    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            T midValue = list.get(mid);
            int comparison = c.compare(midValue, key);

            // Проверяем, равен ли ключ среднему элементу
            if (comparison == 0) {
                return mid; // Найден элемент
            } else if (comparison < 0) {
                left = mid + 1; // Ищем в правой половине
            } else {
                right = mid - 1; // Ищем в левой половине
            }
        }

        return -1; // Если элемент не найден, возвращаем -1
    }
}
