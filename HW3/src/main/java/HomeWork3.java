/**
 * Java1 Home work 3
 *
 * @author Anna Velichko
 * @version 23.10.2021
 */

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    static Random random = new Random();

    public static void main(String[] args) {

        int[] arrOne = createAndFillArray(10, true, 4);
        System.out.println(Arrays.toString(arrOne));
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = 1 - arrOne[i];
        }
        System.out.println(Arrays.toString(arrOne));

        int[] arrTwo = createAndFillArray(100, false, 1);
        System.out.println(Arrays.toString(arrTwo));

        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrThree));

        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        int[] arrFive = createAndFillArray(7,true, 4);
        System.out.println(Arrays.toString(arrFive));
    }

    static int[] createAndFillArray(int length, boolean rnd, int value) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            if (rnd) {
                arr[i] = random.nextInt(value);
            } else {
                arr[i] = i + value;
            }
        }
        return arr;
    }
}