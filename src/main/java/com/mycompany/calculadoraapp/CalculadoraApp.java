/**
 *
 * @AliciaJava 2024
 */
package com.mycompany.calculadoraapp;

import java.util.Scanner;
/**
 * 
 * @author 2023
 */
public class CalculadoraApp {

    public static void main(String[] args) {

        //Variable donde almacenamos el valor seleccionado
        //del menú
        int opcion = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                showMenu();

                //En los mensajes opción válida he tenido que sustituido
                //por opcion y valida sin tilde porque aparece el símbolo 
                //de interrogación en las letras con tilde en la compilación
                //Estas líneas de código nos permiten leer del teclado
                //y transformar el valor leído de String a int
                // 1) Recoger el valor escrito en el teclado
                // 2) Transformar esa cadena de caracteres en un valor entero
                opcion = Integer.parseInt(sc.nextLine());

                //Si la opcion es menor que 0 o mayor que 5, no es una
                //opción válida
                if (opcion < 0 || opcion > 5) {
                    System.out.println("Opcion no valida. Vuelva a escoger");
                    //Si la opcion es diferente a cero, solicitamos los 
                    //dos operandos
                } else if (opcion != 0) {

                    System.out.println("\n");

                    float operando1, operando2;

                    System.out.print("Introduzca el primer operando: ");
                    operando1 = Float.parseFloat(sc.nextLine());

                    System.out.print("Introduzca el segundo operando: ");
                    operando2 = Float.parseFloat(sc.nextLine());

                    System.out.println("\n");
                    switch (opcion) {

                        case 1: //Suma
                            System.out.println("El resultado de la suma es " + (operando1 + operando2));
                            break;
                        case 2: //Resta
                            System.out.println("El resultado de la resta es " + (operando1 - operando2));
                            break;
                        case 3: //Multiplicación
                            System.out.println("El resultado de la multiplicación es " + (operando1 * operando2));
                            break;
                        case 4: //División
                            System.out.println("El resultado de la división es " + (operando1 / operando2));
                            break;
                        case 5: //Resto
                            System.out.println("El resto de dividir " + operando1 + " entre " + operando2 + " es " + (operando1 % operando2));
                            break;

                    }

                }

            } while (opcion != 0); //opcion == 0 implicar salir del programa

            System.out.println("Finalizando la ejecucion de la calculadora");

            //He tenido que sustituir ejecución con tilde y sustituirla sin 
            //tilde porque me aparece un símbolo de interrogación
        }
    }

    private static void showMenu() {
        //Imprimimos por consola el menú
        System.out.println("\n"); //Este caracter especial nos permite imprimir una línea en blanco
        System.out.println("***** CALCULADORA *****");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto");
        System.out.println("0. Salir del programa");
        System.out.print("Introduzca una opcion valida: ");
    }
}
