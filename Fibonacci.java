public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Casos base: fibonacci(0) = 0, fibonacci(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Llamada recursiva
        }
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println("El " + number + "° número de Fibonacci es: " + fibonacci(number));
    }
}
