import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int digit=0;
        int sum=0;
        while(a>0){
            digit = a%10;
            sum+=digit;
            a/=10;
        }
        System.out.println(sum);
    }
}
