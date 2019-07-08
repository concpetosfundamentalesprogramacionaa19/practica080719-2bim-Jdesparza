/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author PC
 */
public class Principal {

    public static void main(String[] args) {
        // se guarda en una variable el reultado del metodo obtenerSumaUno
        int valor = SumaNumeros.obtenerSumaUno(5);
        // se imprime el valor de la variable que se retorna
        // del metodo obtenerSumaUno
        System.out.printf("La suma es: %d\n", valor);
        // se guarda en una variable el reultado del metodo obtenerSumaDos
        int valor2 = SumaNumeros.obtenerSumaDos(5);
        // se imprime el valor de la variable que se retorna
        // del metodo obtenerSumaDos
        System.out.printf("La suma es: %d\n", valor2);
    }
}
