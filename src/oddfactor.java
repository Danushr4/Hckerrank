import java.util.Scanner;



public class oddfactor {
    public static boolean fact(int y){
        int count =0;
        for(int i=1;i<=y;i++){
            if(y%i==0){
                count++;
            }
        }
        return (count%2!=0) ? true : false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count =0;
        for(int i =n;i<=m;i++){
            if(fact(i)==true){


                count++;
            }
        }
        System.out.println(count);
    }
}
