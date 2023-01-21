import java.util.Scanner;

public class movehypen {
    public static String Movehypen(String str){
        String str1="";
        String temp = "";
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='-' || i==str.length()-1){
                temp=temp+str.charAt(i);
            }
            else{
                c++;
            }
        }
        for(int j=0;j<c;j++){
            str1 = str1+"-";
        }
        return str1+temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(Movehypen(str));
    }
}
