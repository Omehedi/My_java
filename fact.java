import java.util.Scanner;

public class fact {
    public static int fact(int n) {
        if (n == 1 || n == 0) return 1;
        return n * fact(n - 1);
    }

    public static int sumOfSeries(int n) {
        return fact
        (n) * 6;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = sumOfSeries(n);
        System.out.println("Sum is = " + sum);
    }
}

