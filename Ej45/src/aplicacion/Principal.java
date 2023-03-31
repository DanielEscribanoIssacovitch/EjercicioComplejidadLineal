package aplicacion;

import java.util.Scanner;

public class Principal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el elemento de la sucesión de Fibonacci: ");
        int num = sc.nextInt();
        int resultado = 0;
        System.out.println("El resultado es " + sucesionFibonacci(num, resultado));
    }

    public static int sucesionFibonacci(int num, int resultado){
        //La complejidad temporal del algoritmo i es exponencial, O(2^n)
        //La complejidad espacial del algoritmo es O(n)
        if(num == 1){
            return 0;
        }else if(num == 2){
            return 1;
        }else{
            resultado += sucesionFibonacci(num-1, resultado) + sucesionFibonacci(num -2, resultado);
        }
        return resultado;
    }
}