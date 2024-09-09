import java.util.Arrays;

public class Test {

    public static void binarySearch(int[] sortedArr, int numToFind){
        int left = 0;
        int right = sortedArr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(sortedArr[mid] == numToFind){
                System.out.println("The number is at index: " + mid);
                return;
            } else if (sortedArr[mid] < numToFind) {
                left++;
            }else {
                right--;
            }
        }
        return;
    }

    public static void mergeSor(int[] arr){
        if (arr.length <2){
            return;
        }
        int mid = arr.length /2;
        int[] leftArr = Arrays.copyOfRange(arr,0, mid);
        int[] rightArr = Arrays.copyOfRange(arr,mid, arr.length );

        Test.mergeSor(leftArr);
        Test.mergeSor(rightArr);

        merged(arr, leftArr, rightArr);




    }

    public static void merged(int[] arr,int[] left, int[] right){

        int i =0;
        int j =0;
        int k =0;

        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }
            else if (right[j] < left[i]) {
                arr[k]=right[j];
                j++;
            }

            k++;
        }

        while(i < left.length){
            arr[k] =  left[i];
            i++;
            k++;
        }
        while(j < right.length){
            arr[k] =  right[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));


    }
}
