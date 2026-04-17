package Strings;

import java.util.Scanner;

/*
    implementing Strings and its various methods
*/




public class String1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the String content: ");
        String str = sc.nextLine();
        System.out.println("value of the string: "+ str);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        if(name1==name2){
            System.out.println("both string are equal");
        }
        else{
            System.out.println("both strings are not equal");
        }

        System.out.println(name1.equals(name2));

        System.out.println(name1.equalsIgnoreCase(name2));

        String st = "anand";
        System.out.println(st.length());
        System.out.println(st.charAt(0));

        System.out.println(name1.isBlank());//empty or having just spaces " "
        System.out.println(name1.isEmpty());//empty -> having lenght =0 

        String ans = "   trimming the lines   ";
        System.out.println(ans.trim());// removes the unwanted spaces from the front and end

    }
    
}

