import java.util.Scanner;

public class recursion {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n/10)+(n%10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sum(n));
    }
}
