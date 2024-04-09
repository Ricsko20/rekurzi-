public class rekurzioFibonacci {
    public static void main(String[] args) {
        int n = 10; 
        int fibonacciszam = fibonacci(n);
        System.out.println("A(z) " + n + ". Fibonacci szám: " + fibonacciszam);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }
}
