package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingres la cantidad de dinero que tiene Guillermo: ");
        float guillermo = entrada.nextFloat();
        
        float luis = guillermo / 2;
        System.out.println("Luis tiene " + luis + " pesos ");
        
        float juan = (guillermo + luis) / 2;
        System.out.println("Juan tiene " + juan + " pesos ");
        
        float suma = guillermo + luis + juan;
        System.out.println("La suma de dinero entre los tres es de: " + suma + " pesos ");
    }
    
}