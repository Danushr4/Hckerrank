import java.util.Locale;
import java.util.Scanner;

public class removevowel {
    public static String rev(String s){
        int n = s.length();
        String str1="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'&& s.charAt(i)!='A'&&s.charAt(i)!='E'&&s.charAt(i)!='I'&&s.charAt(i)!='O'&&s.charAt(i)!='U'){
                str1 = str1+s.charAt(i);
            }
        }
        return str1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
//        str = str.toLowerCase();
        System.out.println(rev(str));

    }
}
