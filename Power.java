import java.util.Scanner;
public class Power{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int ans = 1;
        for(int i=0; i<n; i++) {
            ans *= x;
        }
        
        System.out.println(ans);  
    }
}
