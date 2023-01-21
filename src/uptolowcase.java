import java.util.Arrays;
import java.util.Scanner;

public class uptolowcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String str1="";
        int n=str.length();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = str.charAt(i);
        }
//        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=97 && arr[i]<=122){
                str1 = str1 + (char)(arr[i]-32);
//                System.out.println(str1);
            }
            else if(arr[i]>=65 && arr[i]<=90){
                str1 = str1 + (char)(arr[i]+32);
            }
        }
        System.out.println(str1);
    }
}
