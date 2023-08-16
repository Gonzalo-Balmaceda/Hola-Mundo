package Seccion_5;
public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 3.0f;

        if (promedio >= 6.5){
            System.out.println("Felicitaciones, Excelente promedio!");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio!");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio!");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, Necesitas esforzarte un poco mas!");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, Necesitas estudiar mas!");
        } else {
            System.out.println("Reprobado!");
        }
        System.out.println("Tu promedio es " + promedio);
    }
}
