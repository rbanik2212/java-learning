package testing;

import java.util.Arrays;

// {12, 234, 6345, 745, 24, 1} | {12, 234, 6345, 745, 24, 1, 45}
public class Merge {


    public static void mer(int[] arr) {
        int arrSize = arr.length;
        int m = arrSize / 2;
        int i = 0;

        if (arrSize < 2) {
            return;
        }

        int[] leftSide = Arrays.copyOfRange(arr, 0, m), rightSide = Arrays.copyOfRange(arr, m, arrSize);


        System.out.println(Arrays.toString(rightSide));
        System.out.println(Arrays.toString(leftSide));
        System.out.println("before merges stuff"+ Arrays.toString(arr));
        mer(leftSide);
        mer(rightSide);
        merge(arr, leftSide, rightSide);


    }


    public static void merge(int[] originalArr, int[] arr1, int[] arr2) {
        System.out.println("Current state of original array " + Arrays.toString(originalArr));
        int leftSize = arr1.length;
        int rightSize = arr2.length;
        System.out.println("HERE");
        System.out.println("this is left array " +  Arrays.toString(arr1));
        System.out.println("this is right array " + Arrays.toString(arr2));
        System.out.println();

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (arr1[i] < arr2[j]) {
                originalArr[k] = arr1[i];
                i++;
            } else {
                originalArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            originalArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            originalArr[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("this is the now merged array " + Arrays.toString( originalArr));

    }

}
