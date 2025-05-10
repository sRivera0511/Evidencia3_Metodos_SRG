import java.util.Scanner;   // Libreria que permite al usuario ingresar datos.

/* 
    Evidencia 3
    Métodos Númericos

    Método elegido: Gauss-Jordan

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

    System.out.println("\n\nMATRIZ AUMENTADA INGRESADA");      
    mostrarMatriz(matriz);  // Se llama el método para mostrar la matriz aumentada.
    
    System.out.println("\n-------------------------------- Realizar eliminación Gauss-Jordan --------------------------------\n");

    eliminaciónGJ(matriz);  // Se llama el método para resolver la matriz.

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

    // Método para llevar a cabo la eliminación Gauss-Jordan
    public static void eliminaciónGJ(double[][] matriz) {
        
        int n = matriz.length; // Obtiene el tamaño de la matriz.

        for (int i = 0; i < n; i++) {
            
            // Evitamos la división por cero (pivote cero)
            if (matriz[i][i] == 0) {
                System.out.println("Error, pivote cero en la fila " + (i+1));
                return;
            }

            // Se realiza la división con el pivote de la fila actual.
            double pivote = matriz [i][i];
            for (int j = 0; j < n + 1; j++) {
                matriz[i][j] /= pivote;
            }

            // Eliminamos los valores en la columna del pivote en otras filas.
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double valorP = matriz[k][i];
                    for (int j = 0; j < n + 1; j++) {
                        matriz[k][j] -= valorP * matriz[i][j];
                    }
                }
            }

            // Mostrar la matriz tras cada paso
            System.out.println("\nPaso " + (i + 1) + ":");
            mostrarMatriz(matriz);
        }

        System.out.println("\nSoluciones del sistema de ecuaciones:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.4f\n", i+1, matriz[i][n]);   // Utilizo el 'printf' para darle formato a la impresión de texto.
        }
    }
}
