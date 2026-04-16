import java.util.Scanner;
import java.util.Arrays;

/*
implementing different functions on arrays such as sort functions and understanding deep copy and shallow copy
 */


public class array_functions {
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 1, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        // deep copy
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        arr2[0] = 10;
        System.out.println("Original array after deep copy: " + Arrays.toString(arr));
        System.out.println("Deep copied array: " + Arrays.toString(arr2));
        
        // shallow copy
        int[] arr3 = arr;
        arr3[0] = 20;
        System.out.println("Original array after shallow copy: " + Arrays.toString(arr));
        System.out.println("Shallow copied array: " + Arrays.toString(arr3));
        // another method of deep copy
        int[] arr4 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr4[i] = arr[i];
        }
    }
    
}
