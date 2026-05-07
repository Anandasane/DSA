package searching;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr = new int [n];
        System.out.println("Enter the elements in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Implementing binary search 
        int low = 0 , high = n-1;
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        // Binary search algorithm
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found in the array.");
        sc.close();
    }
    
}
