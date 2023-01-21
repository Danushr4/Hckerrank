import java.util.Scanner;

public class maxoccuofchar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str[] = str1.split("");
        int arr[] = new int[256];
        int count=0;

        for(int i=0;i<str1.length()-1;i++){
            arr[str1.charAt(i)]++;
        }

        int max =-1;
        char result=' ';

        for(int i=0;i<str1.length();i++){
            if(max <= arr[str1.charAt(i)]){
                max = arr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }
        System.out.println(result);
    }
}