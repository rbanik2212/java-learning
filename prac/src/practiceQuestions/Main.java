package practiceQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(100,70,60,50,40));
        int test = BinarySearch(65, arr);
        System.out.println("index is " + test);

    }


    private static int BinarySearch(int score, List<Integer> ranked){
        int low = ranked.size() -1;
        int high = 0;

        while(low >= high){
            int mid = high + (low - high) /2;
            System.out.println("mid" +mid);
            System.out.println("low" + low);
            System.out.println("high" + high);
            if(low == high){
                System.out.println("here");
                return low;
            }
            if(ranked.get(mid) <= score){
                System.out.println("here1");
                if((low - 1) == high && (high +1) == low ){
                    return low;
                }
                low = mid -1;
            }
            else if(ranked.get(mid) >= score){
                System.out.println("here2");
//                if((low - 1) == high && (high +1) == low ){
//                    return high;
//                }
                high = mid + 1;
            }


        }
        return -1;


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
