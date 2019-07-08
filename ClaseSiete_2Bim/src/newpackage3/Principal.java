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
public class Principal {

    public static void main(String[] args) {
        // declaracion del arreglo y los valores de sus posiciones
        int[] Arreglo = {10, 20, 30, 1, 2, 3, 40, 4};
        // se guarda el valor retornado del metodo obtenerTamanioArreglo
        // en una variable
        int valor = TamanioArreglo.obtenerTamanioArreglo(Arreglo,
                Arreglo.length);
        // se imprime el resultado de la variable valor
        System.out.printf("EL tamaño del arreglo es: %d\n", valor);
        // se guarda el valor retornado del metodo obtenerTamanioArregloDos 
        // en una variable
        int valor2 = TamanioArreglo.obtenerTamanioArregloDos(Arreglo,
                Arreglo.length);
        // se imprime el resultado de la variable valor
        System.out.printf("EL tamaño del arreglo es: %d\n", valor2);
    }
}
