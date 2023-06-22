package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
        System.out.println("Ingrese las tres calificacion");
        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();
        
        System.out.println("La suma de las las tres calificacion es: ");
        
        float suma = nota1 + nota2 + nota3;
        System.out.println("suma = " + suma);
        
    }
    
}
