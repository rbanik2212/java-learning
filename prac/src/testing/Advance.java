package testing;

import java.util.Arrays;

public class Advance {

    public static void fib(int n) {
        int tmpNum = 0;
        int fibNum = 0;
        int prevFibNum = 0;

        while (n > 0) {
            System.out.println(fibNum);
            if (fibNum == 0) {
                tmpNum = fibNum;
                fibNum++;
            } else {
                prevFibNum = fibNum;
                fibNum += tmpNum;
                tmpNum = prevFibNum;
            }
            n--;
        }
    }

    public static void prime(int num) {
        int tmp = 0;
        int total = num / 2;

        for (int i = 2; i <= total; i++) {
            if ((num % i) == 0) {
                tmp++;
            }
        }

        if (tmp > 0) {
            System.out.println("Number " + num + " is not prime");
        } else {
            System.out.println("Number " + num + " is prime");
        }

    }

    public static void bubbleSort(int[] arr) {
        int tmp = 0;

        int k = arr.length;

        while (k > 0) {
            int i = 0;
            int j = 1;
            while (j < k) {
                System.out.println(Arrays.toString(arr));
                if (arr[i] >= arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                i++;
                j++;
            }
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void secondLargest(int[] arr) {
        int tmp = 0;

        int k = arr.length;

        while (k > arr.length - 2) {
            int i = 0;
            int j = 1;
            while (j < k) {
                if (arr[i] >= arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                i++;
                j++;
            }
            k--;
        }
        System.out.println("this the second largest number " + arr[arr.length - 2]);
    }

    public static void vowelsAndConst(String str) {
        int vowels = 0, cons = 0;
        Character[] charArray = {'a', 'e', 'i', 'o', 'u'};
        for (char c : str.toCharArray()) {
            boolean found = Arrays.asList(charArray).contains(c);
            if (found) {
                vowels++;
            } else {
                cons++;
            }

        }

        System.out.println("numbers of vowels is: " + vowels);
        System.out.println("numbers of constants is: " + cons);
    }

    public static void armStrong(int num) {
        int armstrong = 0;
        String numToString = Integer.toString(num);

        for (int i = 0; i < numToString.length(); i++) {
            int testnum = (int) Math.pow(Integer.parseInt(String.valueOf(numToString.charAt(i))), numToString.length());
            System.out.println(testnum);
            armstrong += testnum;
        }

        if (num == armstrong) {
            System.out.println(num + " is an armstrong number");
        } else {
            System.out.println("number is not");
        }

    }

    public static void matMul(int[][] mat1, int[][] mat2) {

        int[][] result = new int[mat1.length][mat2.length];
        for(int i=0; i< mat1.length; i++){
            for(int j =0; j<mat2.length;j++){
                for (int k = 0; k < mat2.length; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }





}
