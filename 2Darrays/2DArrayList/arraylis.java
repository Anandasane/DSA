import java.util.ArrayList;

public class arraylis {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);a.add(13);a.add(23);a.add(33);
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
}
