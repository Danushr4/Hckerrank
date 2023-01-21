import java.util.Scanner;

public class rotatestringleft {
    public static String left(String str,int rotate){
        String str1= str.substring(1,str.length())+str;
        if(str.length()%2==0){
            return str1.substring(rotate+1,str1.length()-rotate);
        }
        return str1.substring(rotate,str1.length()-rotate);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int rot = in.nextInt();
        System.out.println(left(str,rot));
    }
}
