//Jueves 18 de Septiembre de 2025
//MarZamora29

/*
 * Programa que determina si un número ingresado por el usuario es "afortunado".
 * Un número se considera afortunado cuando la cantidad de dígitos 3, 7, 8 o 9
 * es mayor que la cantidad de los demás dígitos.
 *
 * El programa solicita un número, analiza cada dígito y muestra en pantalla
 * si dicho número es afortunado o no.
 */

import java.util.Scanner;

public class Codigo5 {

    public static void main(String[] args) {

        //Se debe indicar System.in al crear el Scanner
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        
        //nextInt() directamente devuelve un entero
        int numero = s.nextInt();
        
        //Guardamos el número original para mostrarlo al final
        int original = numero;
        
        int afo = 0;
        int noAfo = 0;
        
        //Se procesa cada dígito
        while (numero > 0) {
            int digito = numero % 10; // extraer último dígito
            
            //Contamos los dígitos afortunados (3, 7, 8, 9)
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            
            numero /= 10; // eliminar el último dígito
        }
        
        //Mostrar resultado
        if (afo > noAfo) {
            System.out.println("El " + original + " es un número afortunado.");
        } else {
            System.out.println("El " + original + " no es un número afortunado.");
        }
        
        s.close(); //cerrar Scanner
    }
}
