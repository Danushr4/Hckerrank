import java.util.Scanner;

public class singlevalue {
    public static int sum(long a){
        long digit=0;
        int sum=0;
        while(a>0){
            digit = a%10;
            sum+=digit;
            a/=10;
        }
        return (sum<=9) ? sum : sum(sum);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int m = sum(n);
        System.out.println(m);
//        if(m<=9){
//            System.out.println(m);
//        }
//        else{
//            int k=sum(m);
//            System.out.println(k);
//        }

    }
}
