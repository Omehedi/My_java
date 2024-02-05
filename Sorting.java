
//bubble shorting java solved by java;
/*import java.util.Scanner;

public class Sorting {
    public static void printArray(int ary[]) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println(); // Print a newline after the array elements
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ary[] = { 7, 8, 3, 1, 2 };

        // Bubble sort
        for (int i = 0; i < ary.length - 1; i++) { // outer loop run hoi n-1 time bar;
            for (int j = 0; j < ary.length - i - 1; j++) {
                if (ary[j] > ary[j + 1]) {
                    // Swap
                    int temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        printArray(ary);
    }
}*/





//Selection short java pogram
/*import java.util.Scanner;
public class Sorting{
    public static void printArray(int ary[]){
        for(int i=0; i<ary.length; i++){
            System.out.print(ary[i]+ " ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ary[]={7,8,3,2,1};
        //selection short
        for(int i=0; i<ary.length-1; i++){
            int smallest=i;
            for(int j=i+1; j<ary.length; j++){
                if(ary[smallest]>ary[j]){
                    smallest= j;
                }
                //swap
                int temp=ary[smallest];
                ary[smallest]=ary[i];
                ary[i]=temp;
            }
        }
        System.out.println("Slection short array");
        printArray(ary);
    }
}*/


//insertinon short java solve pogram
/*import java.util.Scanner;
public class Sorting{
    public static void printArray(int ary[]){
        for(int i = 0; i<ary.length; i++){
            System.out.print(ary[i]+ " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ary[]={7,8,3,2,1};

        //insertion short
        for(int i=0; i<ary.length; i++){
            int current=ary[i];
            int j = i-1;
            while(j>=0 && current>ary[j]){
                ary[j+1]=ary[j];
                j--;
            }
            //placement
            ary[j+1]=current;
        }
        printArray(ary);
    }
}*/

//Selection short java my practis
/*import java.util.Scanner;
public class Sorting {
    public static void printArray(int ary[]) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ary[] = { 7, 8, 3, 1, 2 };
        
        // Selection sort
        for (int i = 0; i < ary.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[j] < ary[smallest]) {
                    smallest = j;
                }
            }
            
            // Swap
            int temp = ary[smallest];
            ary[smallest] = ary[i];
            ary[i] = temp;
        }
        
        System.out.println("Selection sort ary");
        printArray(ary);
    }
}*/


//insertion short java my practis
/*import java.util.Scanner;

public class Sorting {
    public static void printArray(int ary[]) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ary[] = { 7, 8, 3, 1, 2 };
        for (int i = 1; i < ary.length; i++) {
            int current = ary[i];
            int j = i - 1;
            while (j >= 0 && current < ary[j]) {
                ary[j + 1] = ary[j];
                j--;
            }
            // placement
            ary[j + 1] = current;
        }
        printArray(ary);
    }
}*/


//insertion short my java practis

import java.util. Scanner;
public class Sorting{
    public static void printArray(int ary[]){
        for(int i=0; i<ary.length; i++){
            System.out.print(ary[i] + " ");
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int ary[] = {7,8,3,1,2};
        //Insertion short
        for(int i= 0; i<ary.length; i++){
            int current= ary[i];
            int j=i-1;
            while(j>=0 && current<ary[j]){
                ary[j+1]=ary[j];
                j--;
            }
            //placement
            ary[j+1]=current;
        }
        printArray(ary);
    }
}


