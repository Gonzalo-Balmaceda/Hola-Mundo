package Seccion_5;

import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un año (YYYY): ");
        int anio = entrada.nextInt();

        System.out.println("Ingrese un mes entre 1 y 12: ");
        int mes = entrada.nextInt();

        int numDias = 0;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9){
            numDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)) {
                numDias = 29;
            } else {
                numDias = 28;
            }
        }
        System.out.println("numDias = " + numDias);
    }
}
