public class Rotatestring {
    public static void main(String[] args) {
        String str = "danush";
        String tmp = str + str;
        int n = str.length();
        int a=0;
        for (int i = 1; i <= n; i++) {
            String substring = tmp.substring(
                    i, i + str.length());
            if (str.equals(substring)){
                a =i;
                break;
            }
        }
        System.out.println(a);
    }
}