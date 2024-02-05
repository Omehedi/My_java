import java. util. Scanner;
public class Average{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        float a, b , c,Average;
        System.out.println("\n enter the 3 numers");

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        Average= (a+b+c)/3;
        System.out.println("\n average=" + Average);
    }
}