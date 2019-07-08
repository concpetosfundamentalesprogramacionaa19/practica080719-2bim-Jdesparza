/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

/**
 *
 * @author PC
 */
public class Principal {

    public static void main(String[] args) {
        // se guarda en una variable el reultado del retorno del metodo 
        // get_potencia
        int valor = Potencia.get_potencia(2, 4);
        // se imprime el resultado
        System.out.printf("El valor resultante es: %d\n", valor);
    }
}
