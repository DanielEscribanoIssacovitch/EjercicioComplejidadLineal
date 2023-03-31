public class Main {
    public static int sumaRecursiva(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumaRecursiva(n - 1);
        }
    }
    public static int sumaIterativa(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n = 10;
        int recursivo = sumaRecursiva(n);
        int iterativo = sumaIterativa(n);
        System.out.println("La suma de los " + n + " primeros números naturales recursivamente es: " + recursivo);
        System.out.println("La suma de los " + n + " primeros números naturales iterativamente es: " + iterativo);
    }
}