import java.util.Scanner;

public class prime {
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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(prime(n));
        for(int i=2;i<=100;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
}
