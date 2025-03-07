/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.algoritmos.aa_uc2_251990;
/**
 *
 * @author darkheaven
 */
public class Ordenamientos {
 
/**
 * ImLuisAlvarado
 * @param a el arreglo con los datos a ordenar.
 * @return el arreglo ordenado.
 * 
 * Complejidad temporal en el peor caso:
 * - Ciclo externo: (n - 1) iteraciones.
 * - Ciclo interno: (n - i) iteraciones por cada ciclo externo.
 * - Operaciones por iteración del ciclo interno: 4 (1 comparación + 3 asignaciones).
 * - Total de operaciones: 4 * SUM(i=1 to n-1) (n - i) = 2n(n - 1).
 * - Complejidad temporal: O(n^2).
 */
public static int[] ordenamientoBurbuja(int[] a) {
    // Ciclo externo: se ejecuta (n - 1) veces, donde n es el tamaño del array.
    for (int i = 1; i < a.length; i++) {                   
        // Ciclo interno: en cada iteración del ciclo externo, se ejecuta (n - i) veces.
        for (int j = 0; j < a.length - i; j++) {           
            // Comparación: se ejecuta (n - i) veces en cada iteración del ciclo interno.
            if (a[j] > a[j + 1]) {                         
                // Intercambio de elementos (3 operaciones de asignación):
                // 1. int aux = a[j];
                // 2. a[j] = a[j + 1];
                // 3. a[j + 1] = aux;
                int aux = a[j];                            
                a[j] = a[j + 1];                          
                a[j + 1] = aux;                            
            }
        }
    }
    // Retorno del array ordenado: 1 operación al final del algoritmo.
    return a;                                              
}
    
}
