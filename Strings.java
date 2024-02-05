
    //compare pogram
/*import java.util.Scanner;
public class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //conpare
        String name1="mehedi";
        String name2="mehedi";

        // 1 s1>s2: pos value
        // 2 s1==s2:equal to
        // 2 s1<s2:neg value
        if(name1.compareTo(name2)==0){
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("String are not equal");
        }
    }
}*/



// user name defaind pogram
/*import java.util.Scanner;
public class Strings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        System.out.println("Your Name is :"+name);
    }
}*/




//String Builder
/*import java.util.*;
public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("mehedi");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            
            // Swap characters
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}*/



public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("mehedi");

        // character index 0
        System.out.println(sb.charAt(0));

        // set character at index 0
        sb.setCharAt(0, 'T'); 
        System.out.println(sb);
    }
}

