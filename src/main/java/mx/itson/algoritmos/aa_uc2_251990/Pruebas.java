/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.algoritmos.aa_uc2_251990;
import java.util.Arrays;
import static mx.itson.algoritmos.aa_uc2_251990.Ordenamientos.insertionSort;
import static mx.itson.algoritmos.aa_uc2_251990.Ordenamientos.ordenamientoBurbuja;
/**
 *
 * @author darkheaven
 */
public class Pruebas {

    public static void main(String[] args) {
        int[] peorCaso = {6, 5, 4, 3, 2, 1}; // Peor caso: arreglo ordenado en sentido inverso
        System.out.println("Arreglo antes de ordenar:");
        
    
        System.out.println("Antes de ordenar:");
        System.out.println(Arrays.toString(peorCaso));

        // Ordenar los arrays
        peorCaso = insertionSort(peorCaso);

        // Imprimir arrays después de ordenar
        System.out.println("\nDespués de ordenar:");
        System.out.println(Arrays.toString(peorCaso));
    
    }
}
