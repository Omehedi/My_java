import java.util.Scanner;
public class Switch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int day= 7;
        switch(day){
           case 1:
           System.out.println("frayday");
           break;
           
           case 2:
           System.out.println("wednesday");
           break;

           case 3:
           System.out.println("saturday");
           break;

           case 4:
           System.out.println("monday");
           break;

           case 5:
           System.out.println("wednes day");
           break;
           default :
           System.out.println("invalid day");
           break;

        }
    }
}