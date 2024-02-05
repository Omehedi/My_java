import java.util.Scanner;

public class Conditional{
   public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        sc.close();
        if(num > 0){
            System.out.println("This is a positive number");
        } else {
            System.out.println("This is a negative number");
        }

   }
} 
