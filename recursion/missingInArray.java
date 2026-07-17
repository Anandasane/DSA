import java.util.*;

public class missingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }

        int missing = missingNum(ar);
        System.out.println("\nMissing number: " + missing);
    }

    public static int missingNum(int arr[]) {
        int n = arr.length + 1;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1) {
                i++;
            } else {
                int idx = arr[i] - 1;
                if (idx < arr.length && arr[i] != arr[idx]) {
                    swap(arr, i, idx);
                } else {
                    i++;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n;
    }

    public static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}