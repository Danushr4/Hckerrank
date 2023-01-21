import java.util.Scanner;

public class eletrostatic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum = sum +arr[i];
            }
            else{
                sum = sum -arr[i];
            }
        }
        int sum1 = Math.abs(sum) *100;
        System.out.println(sum1);
    }
}
