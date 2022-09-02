//26. Remove Duplicates from Sorted Array
//Example 1:
//
//        Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).
//        Example 2:
//
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//        Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Remove_duplicatefrom_26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i < nums.length;i++){
            arr.add(nums[i]);

        }


        System.out.println(arr);

        return arr.toArray().length;
    }

//    public static int removeDuplicates(int[] nums){
//        int count =1;
//        for (int i =1; i<nums.length;i++){
//            if(nums[i] > nums[i-1]){
//                count++;
//            }
//        }
//        return count;
//    }
}
