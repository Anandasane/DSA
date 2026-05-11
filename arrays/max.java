
import java.lang.Math;
import java.util.Arrays;
public class max {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int maxVal = arr[0];

        for(int i = 1; i < arr.length; i++){
            maxVal = Math.max(maxVal,arr[i]);
            
        }
        System.out.println("The maximum value in the array is: " + maxVal);

    }
}
