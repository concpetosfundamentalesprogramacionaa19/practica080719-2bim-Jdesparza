/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage3;

/**
 *
 * @author PC
 */
public class TamanioArreglo {

    // metodo de tipo entero para calcular el tamaño del arreglo
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        // para en el caso de que tamanio sea 1 retorne el valor del arrglo 
        // en la posicion 0
        if (tamanio == 1) {
            // retorna el valor del arreglo en la posicion cero
            return arreglo2[0];
            // // en el caso de que no se cumpla la condicion if
        } else {
            // se retorna el valaor de la posicion del tamaño menos 1, mas el
            // mismo metodo con su variable tamanio menos 1
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2,
                    tamanio - 1);
        }
    }

    // metodo de tipo entero para calcular el tamaño del arreglo
    public static int obtenerTamanioArregloDos(int arreglo2[], int tamanio) {
        // declaracion de variables e inicializacion de las mismas
        int contador;
        int suma = 0;
        // para recorrer todo el arreglo e ir sumando los valores 
        // de las posiciones
        for (contador = 0; contador < tamanio; contador++) {
            // se suman los valores de las posiciones del arreglo
            suma = suma + arreglo2[contador];
        }
        // se retorna suma
        return suma;
    }
}
