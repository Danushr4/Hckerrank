import java.util.*;

public class arrsumofsmalllarge {
    public static void main(String[] args) {
        Integer[] num = {7,2,6,15,54,10,23};
        int n = num.length;
        int max = num[0];
        int min = num[0];
        for(int i=0;i<n;i++){
            if(num[i]>max){
                max=num[i];
            } else if (num[i]<min) {
                min = num[i];
            }
        }
        System.out.println(max+min);

//        int min = Collections.min(Arrays.asList(num));
//
//        int max = Collections.max(Arrays.asList(num));
//
//        System.out.println(min+max);
    }
}
