/*import java.util.Scanner;

public class TwoArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        // Input rows
        for (int i = 0; i < rows; i++) {
            // Cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/


/*import java.util.Scanner;
public class TwoArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int cols = sc.nextInt();
        sc.close();
        int [] [] numbers = new int [rows][cols];

        //input rows
        for(int i =0; i<rows; i++){
             //input cols
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //out put
        for(int i= 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/




//Alada kisu

/*mport java.util.Scanner;
public class TwoArray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int rows = sc.nextInt();
        int cols= sc.nextInt();
        int [][] numbers= new int[rows][cols];
        sc.close();
        //input rows 
        for(int i = 0; i<rows; i++){
            //input clos
            for(int j = 0; j<cols; j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i =0;i<rows; i++){
            for(int j =0; j<cols; j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at location(" +i+","+j +")");
                }
            }
        }
    }
}*/


import java.util.Scanner;
public class TwoArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i= 0; i<=11; i++){
            System.out.println(n*i);
        }
    }
}
