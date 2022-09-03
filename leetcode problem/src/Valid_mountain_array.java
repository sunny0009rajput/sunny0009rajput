//941. Valid Mountain Array
public class Valid_mountain_array {
    public static void main(String[] args) {
        int[] nums = {2,0,2};
        System.out.println(validMountainArray(nums));

    }
    public static boolean validMountainArray(int[] arr) {
//        int count =1;
//        boolean val = false;
//        if(arr.length >= 3){
//            for(int i=1;i<arr.length;i++){
//                if(arr[i-1] < arr[i]){
//                    count++;
//
//                }
//                if(arr[i-1] > arr[i] && arr[count] > arr[i]){
//                    count++;
//                    val = true;
//                }
//
//            }
//        }else{
//            val = false;
//        }
//        return val;
        int max =arr[0];
        int index = 0;
        int count =0;
        int count1 =1;
        boolean x = false;
        if(arr.length >= 3){
            for(int i =1 ;i <arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                    index = i;
                }

            }
            for(int j=1;j<=index;j++){
                if(arr[j] > arr[j-1]){
                    count++;
                }
            }
            for(int k =index+1;k<arr.length;k++){
                if(arr[k]< arr[k-1]){
                    count1++;
                }
            }
        }else{
            return false;
        }
        if(count == index && count1 > 1 && count > 0 && count1 == (arr.length-index)){
            return true;
        }else{
            return false;
        }


    }
}
