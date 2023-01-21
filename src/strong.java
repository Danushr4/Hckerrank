import java.util.Scanner;

public class strong {
    public static int get(int x){
        int fact =1;
        if(x==1){
            return 1;
        }
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp=n;
        int sum=0;
//       System.out.println(get(n));
        while(n>0){
            int dig = n%10;
            sum += get(dig);
//            System.out.println(sum);
            n/=10;
        }
//        System.out.println(sum);
        if(temp==sum){
            System.out.println("strong");
        }
        else{
            System.out.println("Not strong");
        }
    }
}
