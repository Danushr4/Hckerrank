import java.util.Scanner;

public class printspclchar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='1'&&str.charAt(i)<='9'){
                continue;
            }
            else{
                c++;
            }
        }
        System.out.println(c);
    }
}
