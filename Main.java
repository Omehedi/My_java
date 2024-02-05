/*import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        
        // Concatenation
        String firstName = "Mehedi";
        String lastName = " Hasan";
        String fullName = firstName+"@"+lastName; // Corrected concatenation
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}*/


import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name1= "mehedi";
        String name2= "Hasan2";
    
        if(name1.compareTo(name2)==0){
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("String are not equal");
        }
    }

}