import java.util.Scanner;

public class minchartomakepalin {
    public static Boolean palin(String str){
        String rev="";
        String temp = str;
        for(int i =str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(temp.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int c=0;
        if(palin(str)){
            c=0;
        }
        else{
            for(int i=1;i<str.length();i++){
                String s= str.substring(i,str.length());
                System.out.println(s);
                c=i;
                if(palin(s)){
                    break;
                }
            }
        }
        System.out.println(c);
    }
}
