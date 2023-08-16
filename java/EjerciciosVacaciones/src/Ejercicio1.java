import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercicio 1 con estructura if-else
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese sus 3 notas: ");
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();

        double promedio =  (nota1 + nota2 + nota3)/3;

        if (promedio >= 7.0){
            System.out.println("El alumno esta aprobado con " + promedio);
        } else {
            System.out.println("El alumno esta desaprobado con " + promedio);
        }
    }
}
