import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double precioFinal = 0;
        double descuento = 0;

        System.out.println("Ingrese la cantidad a pagar: ");
        double compra = entrada.nextDouble();

        if (compra > 100){
            descuento = compra * 0.2;
            precioFinal = compra - descuento;
        } else {
            descuento = 0;
            precioFinal = compra - descuento;
        }
        System.out.println("El precio final a pagar es de " + precioFinal);
    }
}
