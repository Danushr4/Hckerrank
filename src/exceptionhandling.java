import java.util.Scanner;

public class exceptionhandling {
        public static int power(int x, int y)
        {
            int temp;
            if (y == 0)
                return 1;
            temp = power(x, y / 2);

            if (y % 2 == 0)
                return temp * temp;
            else {
                if (y > 0)
                    return x * temp * temp;
                else
                    return (temp * temp) / x;
            }
        }
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                int n = in .nextInt();
                int p = in .nextInt();
                if(n>0 && p>0){
                    System.out.println(power(n,p));
                }
                else if(n==0 || p==0){
                    System.out.println("java.lang.Exception: n and p should not be zero.");
                }
                else if(n<0 || p<0){
                    System.out.println("java.lang.Exception: n or p should not be negative.");
                }
            }
        }
    }

