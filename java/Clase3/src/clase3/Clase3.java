/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

public class Clase3 {
    
    public static void main(String[] args) {

        //var - inferencia de tipo en java.
       /* var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        //soutv + tab

        //Ejercicio de concatenacion.
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));

        //Ejercicios Caracteres Especiales.
        var nombre = "Natalia";
        System.out.println("Nueva linea: \n" + nombre); //Diagonal inversa y letra "n".
        System.out.println("Tabulador: \t" + nombre); //Tabulador un espacio para centrar.
        System.out.println("\t.:MENU:.");
        System.out.println("Retroseso: \b" + nombre); //Caracter de retroseso.
        System.out.println("Comillas simples: \'" + nombre + "\'"); //Comillas simples.
        System.out.println("Comillas dobles: \"" + nombre + "\"");*/ //Comillas dobles.
        
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escribe el titulo");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2+" "+usuario2);
    }

}
