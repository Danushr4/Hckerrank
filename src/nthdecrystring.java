//import java.util.Arrays;
//import java.util.Scanner;
//
//public class nthdecrystring {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        int n = in.nextInt();
//        char ans=' ';
//        int arr[] = new int[str.length()];
//        char arr1[] = new char[str.length()];
//        int j=0;
//        int k=0;
//        for(int i=0;i<str.length()-1;i++){
//            if(str.charAt(i)>='a'&&str.charAt(i)<='z' || str.charAt(i)>='A'&&str.charAt(i)<='Z'){
//                arr1[j] = str.charAt(i);
//                j++;
//            }
//            else{
//                arr[k] = str.charAt(i);
//                k++;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
//
//    }
//}