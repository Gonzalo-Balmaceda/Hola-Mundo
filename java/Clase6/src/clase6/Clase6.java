package clase6;

import java.util.Scanner;

public class Clase6 {
    public static void main(String[] args) {
        
       /* //Tipo primitivos tipo boolean
        boolean varBool = true;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        
        //Algoritmo: ¿Eres mayor de edad?
        var edad = 20;
        var adulto = edad >= 18;
                
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }*/
       
//       //Conversion de tipos primitivos
//       var edad = Integer.parseInt("20");
//        System.out.println("edad = " + (edad + 1));
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
//        //Pedir un valor
          var entrada = new Scanner(System.in);
//        System.out.println("Digite una edad: ");
//        edad = Integer.parseInt( entrada.nextLine());
//        System.out.println("Edad = " + edad);
        
       //Conversion de tipos primitivos en java parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
       
        var fraseChar = "Programadores".charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(6);
        System.out.println("fraseChar = " + fraseChar);
        
        
    }
}
