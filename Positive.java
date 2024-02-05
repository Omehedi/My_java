import java .util.Scanner;
public class Positive{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int pos= 0, neg=0, zero=0;
        int num=sc.nextInt();

        for(int i =1; i>0; i++);
        System.out.println("enter the exit number ");

        if(num>0)
        pos++;
        else if(num<0)
        neg++;
        else
        zero++;
        System.out.println("Enter 0 for exit and any numbers %d times" +pos);
         System.out.println("Enter 0 for exit and any numbers  %d times" +neg);
          System.out.println("Enter 0 for exit and any numbers %d times " +zero);
    }
}