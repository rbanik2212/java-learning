package practiceQuestions;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nTest = {2,4,3};
        int[] test = ques2(nTest);

        System.out.println(Arrays.toString(test));

    }


    public static int[] ques2(int[] n){
        int counter = 0;
        int [] count = new int[3];


        for(int i =0; i < n.length; i++){
            int left = i -1;
            int right = i;

            if(left < 0){
                count[i] = 0;
            }
            else{
                if (n[left] < n[right]){

                    int diff = Math.abs( n[left] - n[right]);
                    counter += diff;
                    count[i] = counter;
                }else {
                    int diff = Math.abs( n[left] - n[right]);
                    counter -= diff;
                    count[i] = counter;
                }
            }

        }
        return count;
    }
}
