package files;

public class Test {
    public static void main(String[] args) {
        Integer a = 3;
        Integer b = 5;
        Integer mx = null;
        if (a >= b) {
            mx = a;
        } else {
            mx = b;
        }
        System.out.println(mx);
        Integer f = 1;
        for (Integer i = 1; i <= mx; i++) {
            f = f * i;
        }
        System.out.println(f);
    }
}
