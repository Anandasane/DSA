import java.util.Scanner;
/* 
printing and searching in an array using recursion

*/

public class recursionOnArray {
    public static void main(String[] args) {
        int[] arr = {24,3,4,45,6,45,5};
        recPrint(arr,0);
        System.out.println();
        recPrintReverse(arr,0);
        int target = 6;
        System.out.println();
        System.out.println(exists(arr,target,0));



    }

    public static void recPrint(int[] arr,int idx){
        if(idx == arr.length)return;
        System.out.print(arr[idx]+" ");
        recPrint(arr,idx+1);

    }

    public static void recPrintReverse(int[] arr,int idx){
        if(idx == arr.length)return;
        recPrintReverse(arr,idx+1);
        System.out.print(arr[idx]+" ");

    }

    public static boolean exists(int[] arr, int target, int idx){
        if(idx == arr.length)return false;
        if(arr[idx] == target)return true;
        return exists(arr,target,idx+1);
    }

}
