import java.util.Scanner;

public class pattern2 {
    public static void patternPrinting(int n) {
        for(int i=1;i<=n;i++){
            for(int sp=n-i;sp>0;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j== 2*i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int sp=n-i;sp>0;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        patternPrinting(n);
    }
}