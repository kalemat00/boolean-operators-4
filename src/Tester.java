public class Tester {
    public static void main(String[] args) {
        int a = 1, b = 3, c = a * b, d = c;

        System.out.println((d / c + 2) >= b || !(c + b - c / a == 3));    //true

        int x = 5, y = 6;
        boolean t = false, f = true;

        System.out.println((x * x - y * y / 2 != 12) || !t && f);    //true

    }
}
