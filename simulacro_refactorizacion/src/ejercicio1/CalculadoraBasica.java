/**
 * @author Mateo Mudano
 * @version 1.0
 */

package ejercicio1;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Básica en Java");
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Elige una operación: (+, -, *, /)");
        char operacion = scanner.next().charAt(0);

        double resultado;

        switch (operacion) {
            case '+':
                resultado = sumar(num1, num2);
                break;
            case '-':
                resultado = restar(num1, num2);
                break;
            case '*':
                resultado = multiplicar(num1, num2);
                break;
            case '/':
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Operación inválida");
                scanner.close();
                return;
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }

    /**
     * Metodo para la suma de la calculadora
     * @param numero 1
     * @param numero 2
     * @return resultado
     */
    public static double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Metodo para la resta de la calculadora
     * @param numero 1
     * @param numero 2
     * @return resultado
     */
    public static double restar(double a, double b) {
        return a - b;
    }

    /**
     * Metodo para la multiplicacion de la calculadora
     * @param numero 1
     * @param numero 2
     * @return resultado
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Metodo para la division de la calculadora, verifico que el divisor no sea 0
     * @param numero 1
     * @param numero 2
     * @return resultado
     */
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero");
            return Double.NaN;
        }
    }
}
