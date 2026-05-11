import java.util.Scanner;
/* 
printing intersection of two arrays 
using the brute force method 

*/

public class intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sieze of the first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter the elements of the first array: ");
        for(int i = 0 ; i<n; i++){
          arr1[i] = sc.nextInt();

        }
        System.out.println("Enter the sieze of the second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the Second array: ");
        for(int i =0 ; i<m;i++){
          arr2[i]=sc.nextInt();

        }
        System.out.print("Intersection: ");
        intersectionOFArrays(arr1, arr2);

    }

    static void intersectionOFArrays(int[]arr1,int[]arr2){
      int n = arr1.length;
        int m = arr2.length;

        // Loop through first array
        for (int i = 0; i < n; i++) {
            // Loop through second array to find match
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    
                    // Optional: Break inner loop to avoid printing duplicates 
                    // if the same number appears multiple times in arr2
                    // break; 
                    
                    // NOTE: This simple version prints duplicates if they exist in both.
                    // For a clean set intersection (no duplicates), logic is more complex.
                    break; 
                  }
            }
        }
        System.out.println(); // New line at the end
    

    }
    
}
