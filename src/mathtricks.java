import java.util.Arrays;
import java.util.Scanner;

public class mathtricks {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
        String[] str = new String[s.length()-k+1];
        int n=0;
        int i=0;
        while(n<s.length()-k+1){
            str[i]=s.substring(i,i+k);
            i++;
            n++;
        }
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        System.out.println(str[0]+"/n"+str[str.length-1]);
    }

}
