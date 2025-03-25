# CalculadoraApp

## Descripción

**CalculadoraApp** es una aplicación de consola sencilla escrita en Java que permite realizar operaciones matemáticas básicas 
como suma, resta, multiplicación, división y cálculo de resto entre dos números. El programa proporciona un menú interactivo en la terminal 
para que el usuario seleccione la operación que desea realizar.

El programa gestiona correctamente los errores como la división entre cero y las entradas no válidas, asegurando una experiencia de usuario fluida.

## Funcionalidades

- **Suma**: Realiza la suma de dos números.
- **Resta**: Realiza la resta de dos números.
- **Multiplicación**: Realiza la multiplicación de dos números.
- **División**: Realiza la división de dos números y maneja el caso de división por cero.
- **Resto**: Calcula el resto de la división de dos números, manejando el caso de divisor cero.
- **Salir**: Permite salir del programa.

## Requisitos

- JDK 8 o superior.

## Instalación

1. **Clonar el repositorio**:

   Clona el repositorio en tu máquina local usando el siguiente comando:

   ```bash
   git clone https://github.com/tu-usuario/calculadoraapp.git

   Compilar el código:

Una vez clonado el repositorio, abre la terminal en la carpeta del proyecto y compila el archivo Java:
javac CalculadoraApp.java

Ejecutar la aplicación:

Uso

Al ejecutar el programa, se mostrará un menú interactivo. Debes seleccionar la operación que deseas realizar (ingresando un número del 1 al 5) 
o elegir la opción 0 para salir del programa. Después de seleccionar la operación, el programa te pedirá que ingreses dos números (operandos). 
A continuación, se mostrará el resultado de la operación seleccionada.

Ejemplo de ejecución:
***** CALCULADORA *****
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Resto
0. Salir del programa
Introduzca una opcion valida: 1
Introduzca el primer operando: 10
Introduzca el segundo operando: 5

El resultado de la suma es 15.0

Manejo de errores:

Si el usuario ingresa una opción no válida, el programa le pedirá que ingrese una opción válida.

Si el usuario intenta dividir por cero, el programa mostrará un mensaje de error adecuado.

Si el usuario ingresa un valor no numérico para los operandos, el programa pedirá que ingrese un número válido.

Imágenes del Terminal

A continuación, se muestran algunas capturas de pantalla del programa en funcionamiento en la terminal.

Ejemplo RUN US con el terminal:

![RUN US con java aplicacation](https://github.com/user-attachments/assets/9146d4fa-a3d7-4f67-9646-80949b4515fc)

Ejemplo de uso de operaciones en el terminal:

![Funcionando operaciones en terminal](https://github.com/user-attachments/assets/17feb08b-3729-4ff8-8d8d-8d04b6f6c57c)

### Explicación:

1. **Descripción y funcionalidades**: La descripción del proyecto está al inicio, seguida de una lista de las funcionalidades principales. Este formato hace que el usuario entienda rápidamente qué hace la calculadora.
   
2. **Requisitos e instalación**: He detallado los pasos para clonar el repositorio, compilar el código y ejecutar la aplicación. Esto ayudará a los usuarios a comenzar rápidamente.

3. **Uso**: He proporcionado un ejemplo de cómo usar la calculadora y un ejemplo de la ejecución de un cálculo para mayor claridad.

4. **Manejo de errores**: Se menciona cómo el programa maneja los errores comunes (opciones no válidas, división por cero, y entradas no numéricas).

5. **Imágenes**: Se incluyen ejemplos visuales de cómo se vería el programa en la terminal. Aquí te explico cómo debes proceder con las imágenes:

### Cómo agregar imágenes en tu repositorio de GitHub:

1. **Sube las imágenes** a una carpeta en tu repositorio (puedes llamarla, por ejemplo, `images/`). Si las imágenes están en tu máquina local, sube las imágenes a la carpeta `images` dentro del repositorio.
   
2. **Referencia las imágenes en el README** usando la sintaxis Markdown:  
   ```markdown
   ![Descripción de la imagen](ruta/a/tu/imagen.png)

