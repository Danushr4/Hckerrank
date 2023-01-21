import java.util.Scanner;

public class ceilingnum {
   static int binary(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binary(arr, l, mid - 1, x);

            return binary(arr, mid + 1, r, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[]{1,3,4,6};
        System.out.println(binary(arr,0,3,5));
    }
}
