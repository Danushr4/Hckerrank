import java.util.Arrays;
import java.util.Scanner;

public class onetoonealpha {
    public static String onetone(String str,char a,char b){
        String str2="";
        char str1[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(str1[i]==a){
                str2 = str2+'p';
            }
            else if(str1[i]==b){
                str2 = str2 +'a';
            }
            else{
                str2=str2+str1[i];
            }
        }
        return str2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        char c1 = in.next().charAt(0);
        System.out.println(onetone(str,c,c1));
    }
}
