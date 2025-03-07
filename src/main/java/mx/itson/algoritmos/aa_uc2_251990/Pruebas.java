/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.algoritmos.aa_uc2_251990;
import java.util.Arrays;
import static mx.itson.algoritmos.aa_uc2_251990.Ordenamientos.ordenamientoBurbuja;
/**
 *
 * @author darkheaven
 */
public class Pruebas {

    public static void main(String[] args) {
       int mejorCaso[] = {1,2,3,4,5,6};
       int casoAleatorio[] = {3,5,8,4,2,7};
       int peorCaso[] = {6,5,4,3,2,1};
    
     System.out.println("Antes de ordenar:");
        System.out.println(Arrays.toString(mejorCaso));
        System.out.println(Arrays.toString(casoAleatorio));
        System.out.println(Arrays.toString(peorCaso));

        // Ordenar los arrays
        mejorCaso = ordenamientoBurbuja(mejorCaso);
        casoAleatorio = ordenamientoBurbuja(casoAleatorio);
        peorCaso = ordenamientoBurbuja(peorCaso);

        // Imprimir arrays después de ordenar
        System.out.println("\nDespués de ordenar:");
        System.out.println(Arrays.toString(mejorCaso));
        System.out.println(Arrays.toString(casoAleatorio));
        System.out.println(Arrays.toString(peorCaso));
    
    }
}
