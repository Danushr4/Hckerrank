import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String str1 = in.next();
        int arr[] = new int[256];
        if(str.length()-1!=str1.length()-1){
            System.out.println("nonana");
        }
        else{
            for(int i=0;i<str.length();i++){
                arr[str.charAt(i)]++;
                arr[str1.charAt(i)]--;
            }
            Arrays.sort(arr);
            if(arr[arr.length-1]==0){
                System.out.println("ana");
            }
            else{
                System.out.println("nonana");
            }
        }

    }
}
