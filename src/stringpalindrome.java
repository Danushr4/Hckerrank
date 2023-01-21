import java.util.Scanner;

public class stringpalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String str2="";

        for(int i=str.length()-1;i>=0;i--){

            str2 = str2 + str.charAt(i);

        }

        if(str2.equals(str)){

            System.out.println("palin");

        }
        else{

            System.out.println("nonpalin");

        }
    }
}
