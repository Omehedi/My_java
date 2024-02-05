import java.util.Scanner;
public class Max{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the two numbers");

        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}