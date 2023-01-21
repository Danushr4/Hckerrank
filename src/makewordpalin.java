import java.util.Scanner;

public class makewordpalin {
    public static String reverse(String s){
        String str1 ="";
        for(int i = s.length()-1;i>=0;i--){
            str1 = str1 + s.charAt(i);
        }
        return str1;
    }
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
    public static String makepalin(String str){
        String str1 ="";
        String rev ="";
        int len = str.length()-1;
        if(len%2==0){
            rev= str.substring(0,len);
            str1 = str + reverse(rev);
        }
        else{
            rev= str.substring(0,len);
            str1 = str + reverse(rev);
        }
//        System.out.println(rev);
//        System.out.println(str1);
        return str1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = makepalin(str);
        System.out.println(str1);
        if(palin(str1)){
            System.out.println("palin");
        }
        else{
            System.out.println("not palin");
        }
    }
}



