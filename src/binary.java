import java.util.Stack;

public class binary {
    static int binary(int arr[],int target){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end -start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];// for binary search -1 as element not fount for ceiling a number i.e n>=target return start
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,9,14,16,18};
        int n = 6;
        System.out.println(binary(arr,n));

    }
}
