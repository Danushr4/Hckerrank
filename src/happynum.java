import java.util.Scanner;

//import static sun.security.util.Debug.args;

//import static sun.security.util.Debug.args;

public class happynum {
    public static boolean isHappy(int n) {
        int digit;
        int sum = 0;
        boolean num = false;
        while (n > 0) {
            digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        if (sum == 1) {
            return true;
        } else if (sum == 4) {
            return false;
        } else {
            return isHappy(sum);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean y = isHappy(x);
       System.out.println(y);
    }
}
