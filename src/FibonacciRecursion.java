public class FibonacciRecursion {

    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base case: returns n if n is 0 or 1
        if (n <= 1) {
            return n;
        }
        // Recursive case: sum of the two previous numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int count = 10; // Number of elements to print
        int count1 = 5;
        int count2 = 8;

        System.out.println("Fibonacci Series up to " + count + " terms:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("Fibonacci Series up to " + count1 + " terms:");
        for (int i = 0; i < count1; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("Fibonacci Series up to " + count2 + " terms:");
        for (int i = 0; i < count2; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
