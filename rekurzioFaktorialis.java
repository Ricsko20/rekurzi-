import java.util.Scanner;

public class rekurzioFaktorialis {
    public static void main(String[] args) {
        int szam = 5;
        int fakt = faktorialis(szam);
        System.out.println("A(z) " + szam + "! = " + fakt);
    }

    public static int faktorialis(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorialis(n - 1);
        }
    }
}
