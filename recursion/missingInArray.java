import java.util.*;

public class missingInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sieze of the array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i =0;i<n;i++){
            ar[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }


        missingNum(ar);

    }
    public static int missingNum(int arr[]) {
        int n = 1 + arr.length;
        int i = 0;
        while(i<arr.length){
            if(arr[i]==i+1 || arr[i]==n) i++;
            else{
                int idx =arr[i] -1;
                swap(arr,i,idx);
                
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1) return i+1;
            
        }
        return n;
        
        
    }
    public static void swap(int[] arr, int i , int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}