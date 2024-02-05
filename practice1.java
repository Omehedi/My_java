// recursion my frist java practis
public class practice1 {
    public static void main(String args[]) {
        int result = sum(2, 5);
        System.out.println(result);
    }

    public static int sum(int a, int b) {
        if (b > a) {
            return b + sum(a, b - 1);  // Pass 'a' as well
        } else {
            return b;
        }
    }
}

