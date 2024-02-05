import java.util.Scanner;
public class Divison{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n1=0, n2= 0, n3=0,count=10;
        System.out.println(n1+" "+n2);
        
        if(count>10){
            n3= n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(""+n3);
            System.out.println(count-1); 
        }
    }
}
  

