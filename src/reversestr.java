import java.util.Scanner;

public class reversestr {
    public static void main(String[] args) {
        String str = "The boy is good";
        int len = str.length();
        int count = 1;
        int n=0;
        int m=0;
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                n=i;
                m=i+1;
            }
        }
        for(int i=n-1;i>=0;i--){
            str1 = str1 + str.charAt(i);
        }
        for(int i=len-1;i>=m;i--){
            str2 = str2 + str.charAt(i);
        }
        System.out.println(str1+" "+str2);

    }
}
