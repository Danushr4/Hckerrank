import java.util.Scanner;

public class countuplow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int cu =0;
        int cl =0;
        int di=0;
        int spcl=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                cl++;
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                cu++;
            }
            else if(s.charAt(i)>'0' && s.charAt(i)<='9'){
                di++;
            }
            else if(s.charAt(i)!=' '){
                spcl++;
            }
        }
        System.out.println(cu);
        System.out.println(cl);
        System.out.println(di);
        System.out.println(spcl);
    }
}
