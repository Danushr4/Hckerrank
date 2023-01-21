import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class abprimediff {
    public static boolean prime(int x){
        int c=2;
        while(c*c<=x){
            if(x%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    public static int minmax(int array[]){
        int max = array[0];
        int min = array[0];
        int ab=0;
        if(array.length==1){
            ab=0;
        }
        else{
            for(int i = 0; i<array.length; i++){
                if(array[i]>0){
                    if(array[i]>max){
                        max = array[i];

                    }
                    if(array[i]<min){
                        min = array[i];
                    }

                }

            }
            ab = Math.abs(max-min);
        }
        return ab;
    }
    public static int abss(int arr[],int n){
        int[] m = new int[n];
        int k=0;
        for(int j=0;j<n;j++){
            if(arr[j]>0){
                if(prime(arr[j])){
                    m[k] = arr[j];
                    k++;
                }
            }
        }
        int a = minmax(m);
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(abss(arr,n));

    }
}
