/*
adding the one to the end of the array and if the last element is 9 
then we will make it 0 and add 1 to the previous element and so on 
until we find a non 9 element or we reach the beginning of the array 
and if we reach the beginning of the array then we will add 1 to the
beginning of the array and shift all the elements to the right by one
position.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class addOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        n = arr.length;
        int carry = 1;
        for(int i =n-1;i>= 0;i--){
            if(arr[i]+carry<= 9){
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
           
        }
         if(carry==1)ans.add(1);
            Collections.reverse(ans);
            System.out.println(ans);
    }
    
}
