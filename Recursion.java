
//Recursion class 1//Q1. Print numbers from 5 to 1.
/*import java.util.Scanner;
public class Recursion{
    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);//recursion
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=5;
        printNumbers(n);// n value 5;
    }
}*/


//Recursion class 1//Q2. Print numbers from 1 to 5.
/*import java.util.Scanner;
public class Recursion{
    public static void printNumbers(int n){
        if(n==6){
            return;
        }
        System.out.println(n);//print 
        printNumbers(n+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=1; //main value
        printNumbers(n);
    }
}*/


//Q3. Print the sum of first n natural numbers.
/*import java.util.Scanner;
public class Recursion{
    public static void printSum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        printSum(n-1,sum);//recursion 
    }
    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        printSum(5,0);
    }
}*/


//Q4. Print factorial of a number n.
/*public class Recursion {
    public static int calculateFac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int Fac_nm1 = calculateFac(n - 1);
        int Fac_n = n * Fac_nm1;
        return Fac_n;
    }
    public static void main(String args[]) {
        int n = 5;
        int ans = calculateFac(n);
        System.out.println(ans);
    }
}*/



//Q5. Print the fibonacci sequence till nth term.
/*public class Recursion {
    public static void printFib(int a, int b, int n) {
        if (n <= 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int n = 7;

        System.out.println(a);
        System.out.println(b);
        printFib(a, b, n - 2);
    }
}*/



//Q6. Print x^n (with stack height = n)
/*import java.util.Scanner;
public class Recursion {
    public static int calculatePower(int x, int n) {
        if (n == 0) { // base case 1:
            return 1;
        }
        if (x == 0) {// base case 2:
            return 0;
        }
        int xpowernm1 = calculatePower(x, n - 1);//main work
        int xpowern = x * xpowernm1;
        return xpowern;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =2;
        int n = 5;
        int ans = calculatePower(x, n);
        System.out.println( ans);
    }
}*/




//Q7. Print x^n (with stack height = logn)
/*public class Recursion {
    public static int printPower(int x, int n) {
        if (n == 0) { 
            return 1;
        }
        if (n % 2 == 0) {
            int temp = printPower(x, n / 2);
            return temp * temp;
        } else {
            int temp = printPower(x, n / 2);
            return x * temp * temp;
        }
    }
    
    public static void main(String args[]) {
        int x = 2; // Corrected variable name
        int n = 5; // Corrected variable name
        int output = printPower(x, n);
        System.out.println(output);
    }
}*/
