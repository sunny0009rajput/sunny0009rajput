package basicArray;

public class Max {
    public static void main(String[] args) {
        int[] arr ={5,32,45,12,35,65};
        max(arr);
        min(arr);
    }

    static void max(int[] arr){
        int maxvalue = arr[0];
        for(int i =0;i <arr.length;i++){
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        System.out.println(maxvalue);
    }
    static void min (int[] arr){
        int minvalue =arr[0];
        for (int i =0;i <arr.length;i++){
            if(arr[i] < minvalue){
                minvalue= arr[i];
            }
        }
        System.out.println(minvalue);
    }
}
