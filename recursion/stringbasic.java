import java.util.Scanner;
import java.util.ArrayList;


public class stringbasic{
    public static void main(String[] args){
        String s = "yello";
        change(s);
        System.out.println(s);

        String arr[]= {"yello", "fello", "mello"};
        
        // for(int i= 0; i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        for(String i: arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        ArrayList<String> al = new ArrayList<>();
        al.add("nello");
        al.add("gello");
        al.add("pello");
        System.out.print(al+"this is Array list ");


    }
    
    public static void change(String s){
        s = "world";
       // System.out.println(s);
    }
}
