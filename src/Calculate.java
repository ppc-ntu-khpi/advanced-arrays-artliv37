import java.util.Arrays;

/**
 * Клас Calculte містить методи для знаходження максимальних елементів рядків матриці.
 */

public class Calculate {

    /**
     * Метод findMaxElements знаходить максимальний елемент в кожному рядку матриці.
     * @param matrix матриця, у якій потрібно знайти максимальні елементи.
     * @return масив, що містить максимальні елементи для кожного рядка матриці.
     */

    public static int[] findMaxElements(int[][] matrix) {
        int[] maxElements = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            maxElements[i] = Arrays.stream(matrix[i]).max().orElse(Integer.MIN_VALUE);
        }

        return maxElements;
    }
}