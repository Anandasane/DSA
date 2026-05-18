import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class pascalsTriangle {
    
    /**
     * Generates the first n rows of Pascal's Triangle.
     * 
     * @param n The number of rows to generate.
     * @return A list of lists where each inner list represents a row of the triangle.
     */
    public List<List<Integer>> generate(int n) {
        // Initialize the main list to hold all rows of the triangle
        List<List<Integer>> ans = new ArrayList<>();

        // Loop from row 0 up to row n-1
        for (int i = 0; i < n; i++) {
            // Create a new list for the current row 'i'
            // and add it to our main list 'ans'
            ans.add(new ArrayList<Integer>());

            // Loop through each column 'j' in the current row 'i'
            // Row 'i' has exactly 'i + 1' elements (indices 0 to i)
            for (int j = 0; j <= i; j++) {
                
                // If we are at the first element (j=0) or the last element (j=i) of the row
                if (j == 0 || j == i) {
                    // The value is always 1 for the edges of the triangle
                    ans.get(i).add(1); 
                } else {
                    // For inner elements, the value is the sum of the two numbers 
                    // directly above it in the previous row (i-1).
                    
                    // Get the number from the previous row at the same index (j)
                    int aboveRight = ans.get(i - 1).get(j);
                    
                    // Get the number from the previous row at the previous index (j-1)
                    int aboveLeft = ans.get(i - 1).get(j - 1);
                    
                    // Calculate the sum
                    int val = aboveRight + aboveLeft;
                    
                    // Add the calculated value to the current row
                    ans.get(i).add(val);
                }
            }
        }
        
        // Return the fully constructed Pascal's Triangle
        return ans;
    }

     public List<Integer> getRow(int rowIndex) {
        int n = rowIndex + 1;
         List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            ans.add(new ArrayList<Integer>());
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) ans.get(i).add(1); 
                else{
                    int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    ans.get(i).add(val);
                }
            }
        }
        return ans.get(rowIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pascalsTriangle pt = new pascalsTriangle();
        List<List<Integer>> triangle = pt.generate(n);
        System.out.println(triangle);
        System.out.println(pt.getRow(n-1));
        
        sc.close();
    }

}
