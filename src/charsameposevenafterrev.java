import java.util.Scanner;

public class charsameposevenafterrev {
    public static String rev(String str){
        String rev="";
        for(int i =str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        return rev;
    }
    public static int count(String s){
        String temp=s;
        String str = rev(s);
        int c=0;
        for(int i=0;i<s.length();i++){
            if(temp.charAt(i)==str.charAt(i)){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
//        System.out.println(count(str));
//        System.out.println(withoutrev(str));
    }
}
