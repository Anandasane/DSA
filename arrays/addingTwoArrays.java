/*
given two arrays may have different size but must contains single element 
add both the arrays such that the only the last digit gets added and if the number
exceeds by 9 then carry forward the remaining value to the front of the array and
return the final output array

*/

import java.util.ArrayList;
import java.util.Scanner;

public class addingTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter the elements for the first array: ");
        for(int i = 0; i<n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter the elements for the second array: ");

        for(int i = 0; i<m;i++){
            arr2[i] = sc.nextInt();
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;
        int i = n - 1;
        int j = m - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += arr1[i--];
            if (j >= 0) sum += arr2[j--];
            result.add(0, sum % 10);
            carry = sum / 10;
        }

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    } 
}
