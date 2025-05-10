# Método de Gauss-Jordan - Evidencia 3 - Métodos Númericos ------------------------------------------------------------

Este proyecto implementa el método numérico de *Gauss-Jordan* en Java para resolver sistemas de ecuaciones lineales
de tipo 3x3 o más. El usuario ingresa los coeficientes de la matriz aumentada y el programa realiza paso a paso la 
eliminación para llegar a la solución.


## Autor --------------------------------------------------------------------------------------------------------------

Sebastián Rivera - AL03084547  
Fecha: 09/Mayo/2025

## Instrucciones de uso -----------------------------------------------------------------------------------------------

1. Compila el archivo en tu terminal:
javac GaussJordan.java

2. Ejecuta el programa:
java GaussJordan

3. Ingresa el número de ecuaciones (mínimo 2).

4. Ingresa los coeficientes y términos independientes de cada ecuación cuando se solicite.

5. El programa mostrará la *matriz aumentada ingresada*, los *pasos intermedios* 
de la eliminación y las *soluciones* del sistema.

## Método numérico utilizado ------------------------------------------------------------------------------------------

Se utilizó el método de *Gauss-Jordan*, una variante del método de eliminación de Gauss. Esta técnica convierte 
la matriz aumentada en una *matriz identidad* para obtener directamente las soluciones del sistema sin necesidad 
de sustitución hacia atrás.
