import java.util.Scanner;

public class numbertoalpha {
    public static int sum(int m){
        int sum=0;
        while(m>0){
            int d = m%10;
            sum=sum+d;
            m=m/10;
        }
        return sum<=26?sum:sum(sum);
    }
    public static void numtostr(int n){
//        char arr[] ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
          int c = sum(n);
//        System.out.println(arr[c-1]);
        System.out.println((char)(c+96));

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        numtostr(s);
    }
}
