import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0;//a=-1 we can use this logic when we are asked to print fibo without intializing its sequence value a =0 and b=1
        int b=1;//b=1
        int c;
        for(int i=0;i<n;i++){
            System.out.println(a);// when you use above mentioned method you should print c
            c=a+b;
            a=b;
            b=c;
        }
    }
}
