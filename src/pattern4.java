import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, k = 1,k1=0;

        for (i = 0; i < 4; i++)
        {
            if (i % 2 == 0) {
                for (j = 0; j<=i; j++)
                {
                    if(j!=i){
                        System.out.print(k + "*");
                    }
                    else{
                        System.out.print(k + " ");
                    }
                    k++;
                }
                System.out.println();
            }
            else{
                 k1 = k+i;
                for (j = 0; j<=i; j++)
                {
                    if(j!=i){
                        System.out.print(k1 + "*");
                    }
                    else{
                        System.out.print(k1 + " ");
                    }
                    k1--;
                    k++;
                }
                System.out.println();
            }
        }
    }
}
