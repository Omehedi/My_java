import java.util.Scanner;
public class DoWhile{
    public static void main(Main args[]){
        Scanner sc= new Scanner (System.in);
        int x = 100;

        do {
            System.out.print  ("this is infinite loop");
            x++;
        } while(x>10);
    }
}