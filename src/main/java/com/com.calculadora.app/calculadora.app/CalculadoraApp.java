/**
 *Calculadora en Java que realiza operaciones aritméticas 
 (suma, resta, multiplicación, división y cálculo de resto) 
 y muestra un menú para que el usuario seleccione la operación deseada
 * 
 * @AliciaJava 2024
 */
package com.calculadora.app;

import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {

        // Variable donde almacenamos el valor seleccionado del menú
        int opcion = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                showMenu();

                // Leemos la opción del menú
                opcion = getValidOption(sc);

                // Si la opción es válida, procesamos los operandos
                if (opcion < 0 || opcion > 5) {
                    System.out.println("Opción no válida. Vuelva a escoger.");
                } else if (opcion != 0) {

                    // Pedimos los operandos
                    float operando1 = getOperand(sc, "Introduzca el primer operando: ");
                    float operando2 = getOperand(sc, "Introduzca el segundo operando: ");

                    // Mostramos el resultado según la opción seleccionada
                    switch (opcion) {
                        case 1: // Suma
                            System.out.println("El resultado de la suma es " + (operando1 + operando2));
                            break;
                        case 2: // Resta
                            System.out.println("El resultado de la resta es " + (operando1 - operando2));
                            break;
                        case 3: // Multiplicación
                            System.out.println("El resultado de la multiplicación es " + (operando1 * operando2));
                            break;
                        case 4: // División
                            if (operando2 == 0) {
                                System.out.println("Error: No se puede dividir entre cero.");
                            } else {
                                System.out.println("El resultado de la división es " + (operando1 / operando2));
                            }
                            break;
                        case 5: // Resto
                            if (operando2 == 0) {
                                System.out.println("Error: No se puede calcular el resto con divisor cero.");
                            } else {
                                System.out.println("El resto de dividir " + operando1 + " entre " + operando2 + " es " + (operando1 % operando2));
                            }
                            break;
                    }
                }

            } while (opcion != 0); // Salir cuando la opción sea 0

            System.out.println("Finalizando la ejecución de la calculadora.");
        }
    }

    // Método para mostrar el menú de opciones
    private static void showMenu() {
        System.out.println("\n***** CALCULADORA *****");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto");
        System.out.println("0. Salir del programa");
        System.out.print("Introduzca una opción válida: ");
    }

    // Método para obtener una opción válida del menú
    private static int getValidOption(Scanner sc) {
        int option = -1;
        while (option < 0 || option > 5) {
            try {
                option = Integer.parseInt(sc.nextLine());
                if (option < 0 || option > 5) {
                    System.out.println("Opción no válida. Vuelva a escoger.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
        return option;
    }

    // Método para pedir un operando válido
    private static float getOperand(Scanner sc, String prompt) {
        float operand = 0;
        while (true) {
            try {
                System.out.print(prompt);
                operand = Float.parseFloat(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }
        return operand;
    }
}
