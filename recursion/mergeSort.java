import java.util.*;


public class mergeSort {
    public static void main(String[] args){
        int[] arr ={5,2,95,343,4,32};
        mergeSort(arr);
        for(int ele: arr) System.out.print(ele+" ");

    }
    
    private static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        // step 1: Create 2 new empty arrays of size n/2 each
        int[] a = new int[n/2] ; int[] b = new int[n-n/2];
        // step 2: fill the empty arrays 
        int idx=0;
        for(int i=0;i<a.length;i++)a[i]=arr[idx++];
        for(int i=0;i<b.length;i++)b[i]=arr[idx++];
        // step 3 magic
        mergeSort(a); mergeSort(b);
        // step merge the two array
        merge(a,b,arr);
    }

    public static void merge(int[]a,int[]b,int[]c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];

    }
}
