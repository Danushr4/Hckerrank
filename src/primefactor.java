import java.util.Scanner;

public class primefactor {
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
    public static int factprime(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                if(prime(i)){
                    sum=sum+i;
                }
            }
        }
        return sum+1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factprime(n));
    }
}
