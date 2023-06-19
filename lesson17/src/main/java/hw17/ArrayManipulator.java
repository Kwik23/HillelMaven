package hw17;

import java.util.Arrays;

public class ArrayManipulator {

    public static int[] extractElementsAfterLastFour(int[] inputArray) {
        int lastFourIndex = -1;

        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] == 4) {
                lastFourIndex = i;
                break;
            }
        }

        if (lastFourIndex == -1) {
            throw new RuntimeException("Input array does not contain a four");
        }

        int[] resultArray = new int[inputArray.length - lastFourIndex - 1];
        System.arraycopy(inputArray, lastFourIndex + 1, resultArray, 0, resultArray.length);

        return resultArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] resultArray = extractElementsAfterLastFour(inputArray);
        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Result array: " + Arrays.toString(resultArray));
    }
}
