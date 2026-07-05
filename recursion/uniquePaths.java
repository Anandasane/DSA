import Scanner.util.java;

/*
There is a robot on an m x n grid. The robot is initially located at the top-left corner
 (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). 
 The robot can only move either down or right at any point in time.
Given the two integers m and n, return the number of possible unique paths that the robot can take to 
reach the bottom-right corner.
*/
public class uniquePaths {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(paths(0,0,m-1,n-1));
        
        
    }
    
    public static int paths(int cr, int cc, int lr, int lc) {
        if(cr==lr && cc==lc) return 1;
        if(cr>lr || cc>lc) return 0; // IMPORTANT
        int right = paths(cr,cc+1,lr,lc);
        int down = paths(cr+1,cc,lr,lc);
        return right + down;
    }
}