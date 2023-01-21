import java.util.Arrays;
import java.util.Scanner;

public class hackerrankjavasort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        String[] s = new String[n];
        float[] f = new float[n];
        int arr[] = new int[n];
        int count=0;

        for(int i=0;i<n;i++){
//            a[i] = in.nextInt();
//            s[i] = in.next();
//            f[i] = in.nextFloat();
            count++;
            arr[i] = count;
        }
//        Arrays.sort(s);
        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<n;i++){
//            System.out.println(s[i]);
//        }
    }
}

