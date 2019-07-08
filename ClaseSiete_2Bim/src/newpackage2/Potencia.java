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
public class Potencia {

    public static int get_potencia(int base, int exponente) {
        // para retornar el valor de la variable base cuando esponente sea 1
        if (exponente == 1) {
            // se retorna base
            return base;
            // en el caso que no se cumpla la condicion
        } else {
            // se retorna base multiplicado por el mismo metodo con la variable
            // exponente menos uno
            return base * get_potencia(base, exponente - 1);
        }
    }

}
