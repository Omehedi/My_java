public class mergeshort {
    public static void main(String args[]) {
        int ary[] = {6, 3, 5, 9, 2, 8};
        int n = ary.length;
        divide(ary, 0, n - 1); // Start the sorting process
    }

    public static void divide(int ary[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(ary, si, mid);
        divide(ary, mid + 1, ei);
        conquer(ary, si, mid, ei);
    }

    public static void conquer(int ary[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (ary[idx1] <= ary[idx2]) {
                merge[x++] = ary[idx1++];
            } else {
                merge[x++] = ary[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[x++] = ary[idx1++];
        }

        while (idx2 <= ei) {
            merge[x++] = ary[idx2++];
        }

        for (int i = 0, j = si; i < merge.length; i++, j++) {
            ary[j] = merge[i];
        }
    }
}
