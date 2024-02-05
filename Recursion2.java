//Qs1:towerOfHanoi
//Recursion2 class 
/*public class Recursion2{
    public static void towerOfHanoi(int n, String src, String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk"+n+" from"+src+" to"+dest);
            return;
        }
        towerOfHanoi(n-1, src,dest,helper);
        System.out.println("Transfer disk"+n+"from"+src+"to"+dest);
        towerOfHanoi(n-1,helper,src, dest);
    }
    public static void main(String args[]){
        int n=1;
        towerOfHanoi(n," S", " H", " D");
    }
}*/


//Qs2:print a string in reverse
/*public class Recursion2{
    public static void printRev(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String args[]){
        String str= "abcd";
        printRev(str,str.length()-1);

    }
}*/



//Qs3:Find the 1 & last occurance of an element in String 
/*public class Recursion2 {
    public static int first = -1;
    public static int last = -1;

    public static void occurrence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char curChar = str.charAt(idx);
        if (curChar == element) {
            if (first == -1) {
                first = idx;
            }
            last = idx;
        }

        occurrence(str, idx + 1, element); // Move to the next character
    }

    public static void main(String args[]) {
        String str = "abaacdaefaah";
        char element = 'a';
        occurrence(str, 0, element);
    }
}*/

//Qs4:Check if an arry is sorted(strictly incresing)
/*public class Recursion2 {
    public static boolean isSorted(int ary[], int n) {
        if (n == ary.length - 1) {
            return true;
        }
        if (ary[n] < ary[n + 1]) {
            // ary is sorted till now
            return isSorted(ary, n + 1);
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int ary[] = { 1, 3,  };
        System.out.println(isSorted(ary, 0)); // Corrected the print statement
    }
}*/



//QS 5:move all x to end of the string 
/*public class Recursion2 {
    public static void moveAllX(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newString);
        } else {
            newString += currChar;
            moveAllX(str, idx + 1, count, newString);
        }
    }

    public static void main(String args[]) {
        String input = "axbxcxdxexf";
        moveAllX(input, 0, 0, "");
    }
}*/



//QS:6 - Remove all duplicates in String
/*import java.util.Scanner;

public class Recursion2 {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int idx, StringBuilder newString) {
        if (idx >= str.length()) {
            System.out.println(newString.toString());
            return;
        }

        char currChar = str.charAt(idx);
        if (!map[currChar - 'a']) {
            newString.append(currChar);
            map[currChar - 'a'] = true;
        }

        removeDuplicate(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str ="abbcdcck ";
        removeDuplicate(str, 0, new StringBuilder());
    }
}*/



// QS:7- Print all subsequences
/*public class Recursion2 {
    public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        subsequences(str, idx + 1, newString + currChar);

        subsequences(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        String str = "abc";
       subsequences(str, 0, "");
    }
}*/


//Qs:8 - Print all unique subsequences
/*import java.util.HashSet;
public class Recursion2 {
    public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        
        char currChar = str.charAt(idx);

        uniqueSubsequences(str, idx + 1, newString + currChar, set);
        uniqueSubsequences(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(str, 0, "", set);
    }
}*/



//QS:9 - Print Keypad Combinations
/*public class Recursion2 {
    public static String[] keypad = {".", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TU", "VWX", "YZ"};
    
    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char curChar = str.charAt(idx);
        String mapping = keypad[curChar - '0'];  // Use '0' instead of 'a' to index the keypad
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }
    
    public static void main(String args[]) {
        String str = "23";
        printComb(str, 0, "");
    }
}*/

//java my practice 










