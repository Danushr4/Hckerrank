import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public  static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    public static boolean anagrams(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int flag=1;
        if(n!=m){
            return false;
//            System.out.println("non");
        }
        else{
            int[] arr = new int[n];
            int[] arr1 = new int[m];
            for(int i=0;i<n;i++){
                arr[i] = s1.charAt(i);
                arr1[i] = s2.charAt(i);
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr1));
            sort(arr);
            sort(arr1);
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr1));
            for(int k=0;k<n;k++){
                if((arr[k]-arr1[k])==0){
                    flag =1;
                }
                else{
                    flag =0;
                    break;
                }

            }
            if(flag ==1){
                return true;
            }
            else{
                return false;
            }

        }



    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String s1 = in.next();
        s =s.toLowerCase();
        s1 = s1.toLowerCase();
        if(anagrams(s,s1)){
            System.out.println("Ana");
        }else{
            System.out.println("Non");
        }

    }
}
