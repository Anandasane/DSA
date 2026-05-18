import java.util.ArrayList;

public class arraylis {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);a.add(11);a.add(21);a.add(31);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);b.add(14);b.add(24);b.add(34);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(5);c.add(15);c.add(25);c.add(35);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        //printing the 2D arraylist
        System.out.println("The 2D arraylist is: " + arr);

        System.out.println("Using for loop");
        //printing the 2D arraylist
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Using for each loop");
        //printing the 2D arraylist using for each loop
        for(ArrayList<Integer> row : arr){
            for(Integer element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        return triangle;
    }
}