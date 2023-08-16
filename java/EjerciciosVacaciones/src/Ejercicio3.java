import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int resultado = 0;

        System.out.println("Ingrese dos numeros: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        if (num1 == num2){
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }
        System.out.println("El resultado es " + resultado);
    }
}
