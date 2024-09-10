package testing;

import java.util.ArrayList;

public class Solution2 {

    public static boolean search(int[] nums, int target) {
        boolean res = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[nums.length - i - 1] == target) {
                res = true;
                break;
            }
        }
        return res;
    }


    public static int largestRectangleArea(int[] heights) {

        int i = 0;
        int j = 1;
        ArrayList<Integer> nums = new ArrayList<>();

        while (i < heights.length && j < heights.length) {
            if (heights[i] <= heights[j]) {
                nums.add(heights[i]);
                nums.add(heights[j]);
                System.out.printf("adding i %d and j %d\n", heights[i], heights[j]);

                while (j < heights.length) {
                    int curr = heights[j];

                    if (curr <= heights[j + 1]) {
                        nums.add(heights[j + 1]);
                    } else {
                        break;
                    }

                    j++;
                }
                break;
            } else {
                i++;
                j++;
            }
        }


        for (Integer num : nums) {
            System.out.println(num);
        }
        return 5;

    }



    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;

        int[] heights = {2, 1, 5, 5, 6, 2, 3};


        Solution2.largestRectangleArea(heights);


//        boolean test = testing.Solution2.search(arr, target);

//        System.out.println(test);

    }
}
