import java.util.Scanner;   // Libreria que permite al usuario ingresar datos.

/* 
    Evidencia 3
    Métodos Númericos

    by Sebastián Rivera - AL03084547
    09/May/2025
*/ 


public class GaussJordan {

    public static void main (String[]args) {
    
    Scanner sc = new Scanner(System.in);    // Inicializa el scaner dentro del método 'main'.
    int n;                                  // Representa el número de ecuaciones y de variables.

    System.out.println("\n------------------------------ Evidencia 3 | Métodos Númericos | SRG ------------------------------\n");

    // SECCIÓN INICIAL DEL PROGRAMA
    System.out.println("Método de Gauss Jordan\nv1.0 by SRG");

    do {
        
        System.out.print("\nInserte el número de ecuaciones lineales y variables: (Ej. 3)\n> ");
        
        n = sc.nextInt();
        if (n < 2) {
            System.out.println("El número debe ser al menos 2, intentelo nuevamente.");
        }

    } while (n < 2);
    
    double[][] matriz = new double [n][n + 1];  // Matriz aumentada donde se ingresaran los datos.

    // SECCIÓN PARA EL INGRESO DE COEFICIENTES DE LA MATRIZ AUMENTADA
    System.out.println("\n------------------------------ Coeficientes para la matriz aumentada ------------------------------\n");
    
    System.out.println("A continuación, ingrese los coeficientes de la matriz aumentada:");

    for (int i = 0; i < n; i++) {                               // Contador que toma en cuenta el número de ecuaciones.
        System.out.println("\nECUACIÓN " + (i+1) + "\n|");
        for (int j = 0; j < n; j++) {                           // Contador que toma en cuenta el número de coeficientes.
            System.out.print("|_ Coeficiente " + (j+1) + ": ");
            matriz[i][j] = sc.nextDouble();
        }
        System.out.print("|\n|_ Término independiente: ");      // Se le solicita al usuario el término independiente.
        matriz[i][n] = sc.nextDouble();
    }

    System.out.println("\n\nMATRIZ AUMENTADA INGRESADA\n");      
    mostrarMatriz(matriz);  // Se llama el método para mostrar la matriz aumentada.

    System.out.println("\n--------------------------------- Programa Finalizado v1.0 by SRG ---------------------------------\n");

    sc.close();

    }

    // Método para mostrar la matriz en la terminal.
    public static void mostrarMatriz(double [][] matriz) {
        for (double[] fila : matriz) {
            for (double valor : fila) {
                System.out.print("    " + valor);   // Deja un espacio entre cada valor para que no se vean pegados.
            }
            System.out.println();
        }
    }
}
