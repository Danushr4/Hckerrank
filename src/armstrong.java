import java.util.Scanner;

public class armstrong {
    public static int pow(int n,int m){
        int s=1;
        for(int i=0;i<m;i++){
            s*=n;
        }
        return s;
    }
    public static int sum(int a){
        int digit=0;
        int sum=0;
        while(a>0){
            digit = a%10;
            sum++;
            a/=10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = sum(a);
        int t =a;
        int digit=0;
        int sum=0;
        while(a>0){
            digit = a%10;
            sum+=pow(digit,n);
            a/=10;
        }
        if(sum==t){
            System.out.println(("Armstrong"));
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
