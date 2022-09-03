//896. Monotonic Array
public class Monotonic_array {
    public static void main(String[] args) {
        int[] nums ={1,1};
        System.out.println(isMonotonic(nums));
    }
    public static boolean isMonotonic(int[] nums) {
        int count =1;

        if(nums.length >=2){
            if(nums[0] <= nums[nums.length-1] && nums[0] <= nums[1]){
                for(int j=nums.length-1;j>0;j--){
                    if(nums[j]>=nums[j-1]) {
                        count++;
                    }
                }
            }

            if(nums[0] >= nums[nums.length-1] && nums[0] >= nums[1]){
                for(int j=nums.length-1;j>0;j--){
                    if(nums[j] <= nums[j-1]){
                        count++;
                    }
                }
            }
        }






        if(count >= nums.length){
            return true;
        }else{
            return false;
        }

    }



    }
