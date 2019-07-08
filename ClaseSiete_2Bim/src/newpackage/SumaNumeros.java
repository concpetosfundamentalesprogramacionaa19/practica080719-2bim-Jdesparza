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
public class SumaNumeros {

    // creacion de un metodo int obtenerSumaUno
    public static int obtenerSumaUno(int a) {
        // declaracion de variables e inicializacion de las mismas
        int contador;
        int suma = 0;
        // para ir sumando hasta que el contador sea igual al numero a
        for (contador = 0; contador <= a; contador++) {
            // para sumar
            suma = suma + contador;
        }
        // se retorna suma
        return suma;
    }

    // creacion de un metodo int obtenerSumaDos
    public static int obtenerSumaDos(int a) {
        // para retornar un valor de 0 cuando se cumpla esta condicion
        if (a <= 0) {
            // se retorna 0
            return 0;
            // en el caso de que no se cumpla la condicion el else retornara
            // un valor diferente de 0
        } else {
            // se retorna el valor a, mas el mismo metodo con la variable 
            // a menos 1
            return a + obtenerSumaDos(a - 1);
        }
    }
}
