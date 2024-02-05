//QS:1-permutation of a string
/*public class Recursion3 {
    public static void main(String args[]){
        String str = "abc";
        printperm(str, "");
    }

    public static void printperm(String str, String permutation){
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }
        
        for (int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printperm(newString, permutation + currChar);
        }
    }
}*/

//QS2-CountPathMaze
/*public class Recursion3 {
    public static void main(String[] args) { // main function
        int n = 3;
        int m = 3;
        int totalPaths = countPath(0, 0, m, n); // main function ke call kora holo
        System.out.println(totalPaths);
    }

    public static int countPath(int i, int j, int m, int n) {
        if (i == n || j == m) {
            return 0;
        }

        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // move downwards
        int downPaths = countPath(i + 1, j, m, n); // call kora holo
        // move rightwards
        int rightPaths = countPath(i, j + 1, m, n);
        return downPaths + rightPaths;
    }
}/ */


//QS3
/*public class Recursion3 {
    public static void main(String args[]) {
        int n = 3;
        int m = 3;
        System.out.println(placeTiles(n, m));
    }

    public static int placeTiles(int n, int m) {
        // Base cases
        if (n == m) { 
            return 2;
        }
        if (n == m) { 
            return 1;
        }
        // Recursive cases
        int verticalPlacement = placeTiles(n - 1, m);
        // vertically
        int horizontalPlacement = placeTiles(n - m, m);
        //horizontally

        return verticalPlacement + horizontalPlacement;
    }
}*/


//QS 4
/*public class Recursion3{
    public static void main(String args[]){
        int n= 4;
        System.out.println(callGuest(n));

    }
    public static int callGuest(int n){
        //Base case
        if(n<=1){
            return 1;
        }
        //single
        int single=callGuest(n-1);
        //double
        int mingle=(n-1)*callGuest(n-2);
        return single+mingle;
    }
}*/



//QS 5:

/*import java.util.*;
public class Recursion3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =3; // Input the value of n
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        // base case
        if (n == 0) {
            printSubset(subset);
            return;
        }
        
        // include the current element n
        subset.add(n);
        findSubset(n - 1, subset);

        // exclude the current element n
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void printSubset(ArrayList<Integer> subset) {
        for (int num : subset) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}*/

import java.util.*;
public class Recursion3{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = 3;
        ArrayList<Integer> subdet= new ArrayList<>(null);
        findSubset(n,subdet);
    }
    public static void findSubset(int n,ArrayList<Integer>subset){
        //base case
        if(n==0){
            findSubset(n, subset);
            return;
        }
        subset.add(n);
        findSubset(n-1, subset);
    }
    public static void printSubset(ArrayList<Integer>subset){
        for(int num : subset){
            System.out.println(num+" ");
        }
        System.out.println();
    }
}





