package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final int salario = 1000;
        int comision = 150;
        
        System.out.println("Ingrese la cantidad de carros vendidos: ");
        int venta = entrada.nextInt();
        
        System.out.println("Ingrese el precio de un carro: ");
        int precioCarro = entrada.nextInt();
        
        comision *= venta;
        float precioTotal = venta * precioCarro;
        float porVenta = precioTotal * 0.05F;
        float salarioMensual = salario + comision + porVenta;
        
        System.out.println("El salario mensual es de " + salarioMensual + " dolares ");
    }
    
}
