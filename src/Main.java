import java.security.KeyStore;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation is_odd() {
        return n -> (n & 1) == 1;
    }

    public static PerformOperation is_prime() {
        // O(n^(1/2)) runtime
        return n -> {
            if (n < 2) {
                return false;
            }
            int sqrt = (int) Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public static PerformOperation is_palindrome() {
        return n -> {
            String original = Integer.toString(n);
            String reversed = new StringBuilder(Integer.toString(n)).reverse().toString();
            return original.equals(reversed);
        };
    }
}

public class Main {
    public static String evodd(int n){
        return n%2==0?"EVEN":"ODD";
    }
    public static String prime(int x){
        int c=2;
        int flag =1;
        while(c*c<=x){
            if(x%c==0){
                flag =0;
            }
            c++;
        }
        return flag==1?"PRIME":"COMPOSITE";
    }
    public static String palin(int n){
        int temp = n;
        int rev=0;
        while(n>0){
            int d = n%10;
            rev = rev*10+d;
            n=n/10;
        }
        return temp==rev?"PALINDROME":"0";
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        while(n>0){
//            int m = in.nextInt();
//            switch(m){
//
//                case 1:int n1=in.nextInt();
//                    System.out.println(evodd(n1));
//                    break;
//
//                case 2:int n2=in.nextInt();
//                    System.out.println(prime(n2));
//                    break;
//
//                case 3:int n3=in.nextInt();
//                    System.out.println(palin(n3));
//                    break;
//
//            }
//        }
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m,count=0;
        Deque<Integer> de =  new ArrayDeque<>();
        for(int i=0;i<n;i++){
            m=in.nextInt();
            de.add(m);
        }
        int  un =in.nextInt();
        for (int i=0;i<n;i++){
            if(i+un<de.size()-1){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(de);
    }

}