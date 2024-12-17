package ru.binarysearch;

/**
 * Учебная реализация методов бинарного поиска для массивов.
 *
 * @author Никита Петрович Бородулин.
 */
public class Arrays {

    private Arrays() {
    }

    //<editor-fold desc="byte binary search">
    public static int binarySearch(byte[] a, byte key) {
        int left = 0;
        int right = a.length - 1;

        return byteBinarySearch(a, key, left, right);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        rangeCheck(a, fromIndex, toIndex);

        return byteBinarySearch(a, key, fromIndex, toIndex);
    }

    private static int byteBinarySearch(byte[] a, byte key, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем, равен ли ключ среднему элементу
            if (a[mid] == key) {
                return mid;
            }

            // Если ключ больше среднего элемента, ищем в правой половине
            if (a[mid] < key) {
                left = mid + 1;
            } else { // Иначе ищем в левой половине
                right = mid - 1;
            }
        }

        return -1;
    }
    //</editor-fold>

    //<editor-fold desc="char binary search">
    public static int binarySearch(char[] a, char key) {
        int left = 0;
        int right = a.length - 1;

        return byteBinarySearch(a, key, left, right);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        rangeCheck(a, fromIndex, toIndex);

        return byteBinarySearch(a, key, fromIndex, toIndex);
    }

    private static int byteBinarySearch(char[] a, char key, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем, равен ли ключ среднему элементу
            if (a[mid] == key) {
                return mid; // Возвращаем индекс найденного элемента
            }

            // Если ключ больше среднего элемента, ищем в правой половине
            if (a[mid] < key) {
                left = mid + 1;
            } else { // Иначе ищем в левой половине
                right = mid - 1;
            }
        }

        return -1; // Если элемент не найден, возвращаем -1
    }
    //</editor-fold>

    //<editor-fold desc="double binary search">
    public static int binarySearch(double[] a, double key) {
        int left = 0;
        int right = a.length - 1;

        return byteBinarySearch(a, key, left, right);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        rangeCheck(a, fromIndex, toIndex);

        return byteBinarySearch(a, key, fromIndex, toIndex);
    }

    private static int byteBinarySearch(double[] a, double key, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем, равен ли ключ среднему элементу
            if (a[mid] == key) {
                return mid; // Возвращаем индекс найденного элемента
            }

            // Если ключ больше среднего элемента, ищем в правой половине
            if (a[mid] < key) {
                left = mid + 1;
            } else { // Иначе ищем в левой половине
                right = mid - 1;
            }
        }

        return -1; // Если элемент не найден, возвращаем -1
    }
    //</editor-fold>

    //<editor-fold desc="float binary search">
    public static int binarySearch(float[] a, float key) {
        int left = 0;
        int right = a.length - 1;

        return binarySearch(a, left, right, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        rangeCheck(a, fromIndex, toIndex);

        return byteBinarySearch(a, key, fromIndex, toIndex);
    }

    private static int byteBinarySearch(float[] a, float key, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем, равен ли ключ среднему элементу
            if (a[mid] == key) {
                return mid; // Возвращаем индекс найденного элемента
            }

            // Если ключ больше среднего элемента, ищем в правой половине
            if (a[mid] < key) {
                left = mid + 1;
            } else { // Иначе ищем в левой половине
                right = mid - 1;
            }
        }

        return -1; // Если элемент не найден, возвращаем -1
    }
    //</editor-fold>

    //<editor-fold desc="int binary search">
    public static int binarySearch(int[] a, int key) {
        int left = 0;
        int right = a.length - 1;

        return binarySearch(a, left, right, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        rangeCheck(a, fromIndex, toIndex);

        return byteBinarySearch(a, key, fromIndex, toIndex);
    }

    private static int byteBinarySearch(int[] a, int key, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем, равен ли ключ среднему элементу
            if (a[mid] == key) {
                return mid; // Возвращаем индекс найденного элемента
            }

            // Если ключ больше среднего элемента, ищем в правой половине
            if (a[mid] < key) {
                left = mid + 1;
            } else { // Иначе ищем в левой половине
                right = mid - 1;
            }
        }

        return -1; // Если элемент не найден, возвращаем -1
    }
    //</editor-fold>

    //<editor-fold desc="long binary search">
    public static int binarySearch(long[] a, long key) {
        int left = 0;
        int right = a.length - 1;

        return binarySearch(a, left, right, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        rangeCheck(a, fromIndex, toIndex);

        return byteBinarySearch(a, key, fromIndex, toIndex);
    }

    private static int byteBinarySearch(long[] a, long key, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем, равен ли ключ среднему элементу
            if (a[mid] == key) {
                return mid; // Возвращаем индекс найденного элемента
            }

            // Если ключ больше среднего элемента, ищем в правой половине
            if (a[mid] < key) {
                left = mid + 1;
            } else { // Иначе ищем в левой половине
                right = mid - 1;
            }
        }

        return -1; // Если элемент не найден, возвращаем -1
    }
    //</editor-fold>

    //<editor-fold desc="short binary search">
    public static int binarySearch(short[] a, short key) {
        int left = 0;
        int right = a.length - 1;

        return binarySearch(a, left, right, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        rangeCheck(a, fromIndex, toIndex);

        return byteBinarySearch(a, key, fromIndex, toIndex);
    }

    private static int byteBinarySearch(short[] a, short key, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем, равен ли ключ среднему элементу
            if (a[mid] == key) {
                return mid; // Возвращаем индекс найденного элемента
            }

            // Если ключ больше среднего элемента, ищем в правой половине
            if (a[mid] < key) {
                left = mid + 1;
            } else { // Иначе ищем в левой половине
                right = mid - 1;
            }
        }

        return -1; // Если элемент не найден, возвращаем -1
    }
    //</editor-fold>

    //<editor-fold desc="Служебные методы">
    private static void rangeCheck(byte[] a, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid index range");
        }
    }

    private static void rangeCheck(char[] a, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid index range");
        }
    }

    private static void rangeCheck(double[] a, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid index range");
        }
    }

    private static void rangeCheck(float[] a, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid index range");
        }
    }

    private static void rangeCheck(int[] a, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid index range");
        }
    }

    private static void rangeCheck(long[] a, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid index range");
        }
    }

    private static void rangeCheck(short[] a, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid index range");
        }
    }
    //</editor-fold>


}
