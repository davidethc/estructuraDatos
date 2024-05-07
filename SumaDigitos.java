public class SumaDigitos {
    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n; // Caso base: número de un solo dígito
        } else {
            return n % 10 + sumaDigitos(n / 10); // Llamada recursiva con el número sin el último dígito
        }
    }

    public static void main(String[] args) {
        int numero = 12345;
        System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos(numero));
    }
}
