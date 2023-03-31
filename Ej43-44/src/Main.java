import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int e = sc.nextInt();
        System.out.println(buscar(e, arr));
        System.out.println(buscarRecursivamente(e, arr, 0, arr.length - 1));
    }
    public static boolean buscar(int e, int[] array) {
        //La complejidad temporal en el peor caso es O(n).
        // La complejidad temporal en el mejor caso es O(1).
        // En el caso promedio, la complejidad temporal es O(n/2).
        for (int i = 0; i < array.length; i++) {
            if (array[i] == e) {
                return true;
            }
        }
        return false;
    }

    public static boolean buscarRecursivamente(int e, int[] array, int inicio, int fin) {
        //La complejidad temporal en el peor caso es O(log n).
        if (inicio > fin) {
            return false;
        }
        int medio = (inicio + fin) / 2;
        if (array[medio] == e) {
            return true;
        } else if (e < array[medio]) {
            return buscarRecursivamente(e, array, inicio, medio - 1);
        } else {
            return buscarRecursivamente(e, array, medio + 1, fin);
        }
    }

}