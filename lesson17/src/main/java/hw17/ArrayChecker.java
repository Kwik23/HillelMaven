package hw17;

public class ArrayChecker {

    public static boolean checkArrayComposition(int[] inputArray) {
        boolean containsOne = false;
        boolean containsFour = false;

        for (int num : inputArray) {
            if (num == 1) {
                containsOne = true;
            } else if (num == 4) {
                containsFour = true;
            }
        }

        return containsOne && containsFour;
    }

    public static void main(String[] args) {
        int[] inputArray1 = {1, 4, 4, 1};
        System.out.println(checkArrayComposition(inputArray1)); // true

        int[] inputArray2 = {1, 1, 4, 4};
        System.out.println(checkArrayComposition(inputArray2)); // true

        int[] inputArray3 = {1, 1, 1, 1};
        System.out.println(checkArrayComposition(inputArray3)); // false

        int[] inputArray4 = {4, 4, 4, 4};
        System.out.println(checkArrayComposition(inputArray4)); // false
    }
}
