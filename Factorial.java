import java.util.Scanner;

public class Factorial {
    public static void calculateFac(int n) {
        int fac = 1;

        for (int i = n; i >= 1; i--) {
            fac = fac * i;
        }
        System.out.println(fac);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        calculateFac(n);
    }
}


