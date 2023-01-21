import java.util.*;

//aAbcDbfdab
public class charprdtcode {
    public static void main(String[] args) {
        String str = "aAbcDbfdab";
        char[] arr = str.toCharArray();
        Map<Character, Integer> counters = new HashMap<>();
        for( int i = 0; i < arr.length; i++ ) {
            Integer count = counters.get(arr[i]);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            counters.put(arr[i], count);

        }
        System.out.println(counters);


    }
}
