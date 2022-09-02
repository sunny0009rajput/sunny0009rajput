package basicArray;

import java.util.Arrays;

public class MethodOfArray {
    public static void main(String[] args) {
        int[] arr ={10,12,14,23,25,65,78};

        int[][] arr1 = {
                {10,12,15},
                {12,45},
                {45,12,56,85}
        };
        // 1st method
        System.out.println(Arrays.toString(arr));

        // 2nd method using for loop

        // 3 rf method using for each loop

        for(int element : arr){
            System.out.print(element+" ");
        }
        System.out.println();

        // output of 2d array
        for(int row =0;row <arr1.length;row++){
            for(int col =0;col < arr1[row].length;col++){
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }

        // 2nd method of printing 2d array
        for(int i =0;i<arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }

        // 3rd method of printing 2d array
        for(int[] a : arr1){
            System.out.println(Arrays.toString(a));
        }

    }
}
