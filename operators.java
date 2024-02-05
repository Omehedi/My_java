//Get bit pogram
/*import java.util.Scanner;
public class operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos=2;
        int bitMask=1<<pos;

        if((bitMask&n)==0){
            System.out.println("bit was zero");
        }
        else
        {
            System.out.println("bit was one");
        }
    }
}*/


//Set bit pogram operation
/*import java.util.Scanner;
public class operators{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = 5;
        int pos=1;
        int bitMask=1<<pos;
        int newNumbers=bitMask | n;
        System.out.println(newNumbers);
    }
}*/

//Clear bit pogram operation
/*import java.util.Scanner;
public class operators{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos=2;
        int bitMask = 1<<pos;
        int notBitMask=~(bitMask);
        int newNumbers=notBitMask & n;
        System.out.println(newNumbers);

    }
}*/



//Bit manipulation java pogram to updetion
/*import java.util.Scanner;
public class operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper= sc.nextInt();
        int n = 5;
        int pos=1;

        int bitMask=1<<pos;
        if(oper==0){
            //Set bit operations
            int newNumbers=bitMask| n;
            System.out.println(newNumbers);
        }
        else{
            int newBitMask=~bitMask;
            int newNumbers= newBitMask & n;
            System.out.println(newNumbers);

        }
    }
}*/



//Bit manipulation java pogram update operations
import java.util.Scanner ;
public class operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper= sc.nextInt();
        int n = 5;
        int pos=1;
        int bitMask=1<<pos;
        if(oper==0){
            //Set bit operations
            int newNumbers= bitMask | n;
            System.out.println(newNumbers);
        }
        else{
            //Clear bit operations
            int newBitMask = ~ bitMask;
            int newNumbers= bitMask & n;
            System.out.println(newNumbers);
        }
    }
}