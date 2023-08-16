
import java.util.Scanner;

public class CondicionalEjercicio3 {
    public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
   
        System.out.println("Digite una calificacion entre 0 y 10: ");
        var calificacion = entrada.nextInt();
        
        if(calificacion >= 9 && calificacion <= 10){
            System.out.println("A");
        }
        else if(calificacion >= 8 && calificacion < 9){
            System.out.println("B");
        }
        else if(calificacion >= 7 && calificacion < 8){
            System.out.println("C");
        }
        else if (calificacion >= 6 && calificacion < 7){
            System.out.println("D");
        }
        else if (calificacion >= 0 && calificacion < 6){
            System.out.println("F");
        }
        else{
            System.out.println("Fuera de rango");
        }
        
        // con la sentencia de control switch
        System.out.println("Digite una calificacion entre 0 y 10: ");
        var calificacion2 = entrada.nextInt();
        
        switch(calificacion2){
            case 10: case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                        
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Calificacion invalida");
        }
}
}
