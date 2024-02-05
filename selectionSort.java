/*public class selectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int sml = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[sml]) {
                    sml = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[sml];
            arr[sml] = temp;
        }
    }

    public static void main(String args[]) {
        int[] arr = {7, 8, 3, 2, 1, 5, 6};
        selectionSort(arr);
        for (int e : arr) System.out.print(e + " ");
    }
}*/

public class selectionSort{
    public static void selectionSort(int [] arr){
        for(int i = 0; i<arr.length-1; i++){
            int sml = i;
            for(int j =i + 1; j < arr.length; j++){
                if(arr[j] < arr[sml]){
                    sml = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[sml];
            arr[sml]  = temp;     
         }
    }

    public static void main(String args[]){
        int [] arr = {7, 8, 3, 2, 1, 5, 6};
        selectionSort(arr);
        for(int vallue : arr)System.out.println(vallue + " ");
    }
}


