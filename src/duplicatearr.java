import java.util.*;

public class duplicatearr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        for (int a : list) {
            System.out.println(a);
        }
    }
}
