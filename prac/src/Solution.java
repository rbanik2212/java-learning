import java.util.Arrays;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 1, lengthCount = nums.length, currNumCount = 0;
        int currNum = nums[0];
        while (j < nums.length) {
            if (currNum == nums[j]) {
                currNumCount++;
                if (currNumCount >= 3) {
                    swapToLast(nums, j);
                    lengthCount--;
                    currNumCount--;
                    j--;
                } else if (currNum == nums[i]) {
                    currNumCount++;
                    i++;
                }
            } else {
                currNum = nums[j];
                i = j;
                currNumCount =0;
            }
            j++;
        }
        return lengthCount;
    }

    public static void swapToLast(int[] arr, int index) {
        int i = index;
        while (i < arr.length - 1) {
            int tmp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = tmp;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] l = {1, 1, 1, 2, 2, 3};
        int[] l2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        Solution.removeDuplicates(l);

    }
}