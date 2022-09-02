import java.util.Arrays;

//561. Array Partition
//
//
//        Example 1:
//
//        Input: nums = [1,4,3,2]
//        Output: 4
//        Explanation: All possible pairings (ignoring the ordering of elements) are:
//        1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
//        2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
//        3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
//        So the maximum possible sum is 4.
//        Example 2:
//
//        Input: nums = [6,2,6,5,1,2]
//        Output: 9
//        Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.
//
//
//        Constraints:
//
//        1 <= n <= 104
//        nums.length == 2 * n
//        -104 <= nums[i] <= 104
//        Accepted
//        351,870
//        Submissions
//        461,171
//        Seen this question in a real interview before?
//
//        Yes
//
//        No
//        Obviously, brute force won't help here. Think of something else, take some example like 1,2,3,4.
//        How will you make pairs to get the result? There must be some pattern.
//        Did you observe that- Minimum element gets add into the result in sacrifice of maximum element.
//        Still won't able to find pairs? Sort the array and try to find the pattern.

public class Array_partition_561{
    public static void main(String[] args){
        int[] arr = {1,4,3,2};

//        for(int i =0;i <arr.length;i++){
//            for(int j =1; j<arr.length;j++){
//                System.out.println("("+arr[i]+","+arr[j]+")");
//            }
//        }
        arrayPairSum(arr);
    }

    public static int arrayPairSum(int[] nums) {
        // Sort the list in ascending order
        Arrays.sort(nums);
        // Initialize sum to zero
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            // Add every element at even positions (0-indexed)
            maxSum += nums[i];
        }
        return maxSum;
    }
}
