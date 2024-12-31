package app;

import java.util.Arrays;

public class Main {

    static int[] numArr;

    public static void main(String[] args) {

        numArr = new int[]{1, 33, 99, 27, 23, 3, 46, 43, 63, 59, 75, 77, 97, 86, 9};

        System.out.println("1. Array NOT sorted: " + Arrays.toString(numArr));

        for (int i = 1; i < numArr.length; i++) {
             int key = numArr[i];
             int j = i - 1;
            while (j >= 0 && key < numArr[j]) {
                numArr[j + 1] = numArr[j];
                j--;
            }
          numArr[j + 1] = key;
        }
        System.out.println("2. Array sorted: " + Arrays.toString(numArr));

        int searchNum = 33;

        int low = 0;
        int high = numArr.length - 1;
        int index = 5;

        while (low <= high) {
            int middle = (low + high)/2;
            if (numArr[middle] < searchNum) {
                index = middle;
                break;
            } else if (numArr[middle] < searchNum) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
            if (index == 5) {
                System.out.println("3. Index of number" + " " + searchNum + ", in sorted array, is" +
                        " " + index +  ".");
            } else {

            }
            }

    }
}
