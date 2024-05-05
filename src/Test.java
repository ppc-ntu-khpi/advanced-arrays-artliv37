/**
 * Клас Test перевіряє роботу класу Calculate.
 */

public class Test {
    public static void main(String[] args) {
        int[][] matrix = {
            {-3, 5, 7},
            {7, 0, -2},
            {9, -9, 9}
        };

        int[] maxElements = Calculate.findMaxElements(matrix);

        for (int i = 0; i < maxElements.length; i++) {
            System.out.println("Максимальний елемент у рядку " + (i + 1) + ": " + maxElements[i]);
        }
    }
}