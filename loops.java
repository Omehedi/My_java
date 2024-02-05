/*public class loops {
    public static void main (String args[]){
        int i = 15;
        while(i<15){
            System.out.println("mehedi ");
        }
    }
}*/

/*public class loops{
    public static void main (String args[]){
        int i = 15;
        do{
            System.out.println("mehedi");
        }while (i<15)
    }
}*/

/*public class loops {
    public static void main (String args[]){
        int  i = 20;
        while(i < 15 ){
            System.out.println("Allahu");
        }
    }
}*/

/*public class loops{
    public static void main (String args[]){
        int i = 20;
        do{
            System.out.println("mehedi");
        }while(i<20);

    }
}*/

/*import java.util.Scanner;

public class loops {
    public static void main (String args[]){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int sum = 0;
                for(int i = 0; i <=n;i++ ) {
                    sum = sum +i ;
                }
                System.out.println(sum);

    }
}*/

/*import java.util.Scanner;

public class loops {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        for(int i = 0; i < 11; i ++ ){
            System.out.println(i*n);
        }
    }
}*/



/*public class loops {
    public static void main (String args[]){
        int n = 4; 
        int m = 5; 
        //outer loop 
        for(int i = 1 ; i <=n; i++){
            //inner loop
            for(int j = 1; j <=m; j++){
                //cell -> (i,j)
                if(i==1|| j==1|| i==n|| j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/




public class loops{
    public static void main (String args[]){
        int n = 5;
        int number = 1;
        for(int i = 1; i<=n;i++){
            for(int j =1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}