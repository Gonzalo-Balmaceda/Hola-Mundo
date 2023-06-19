package clase8;

import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {
        // Operadores Unarios
        /*var varA = 7;
        var varB = -varA;
        System.out.println("varA =" + varA);
        System.out.println("varB = " + varB); // El resultado sera un numero negativo
        
        // Operador de negacion
        var varC = true; // Esta literal por default en java es de tipo booleano
        var varD = !varC; // Aqui esta invirtiendo el valor
        System.out.println("varc = " + varC);
        System.out.println("varD = " + varD);
        
        // Operdadores de incremento: Preincremento
        var varE = 9; // Se va a modificar su valor
        var varF = ++varE; // // El doble simbolo al ir antes de la variable, ambas variables seran afectadas
        // Primero se incrementa la variables y despues se usa su valor
        System.out.println("varE = " + varE); // Se incrementa en la unidad
        System.out.println("varF = " + varF); // Va a sumar uno
        
        // Postincremento (El simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++; // Con los simbolos despues de la variables, el incremento solo afecta a la variable 'varG', y 'varH' queda con el valor predeterminado
        System.out.println("varG = " + varG); // Aque va a incrementar en 1
        System.out.println("varH = " + varH);
        
        // Operadores unarios de decremento: Predecremento
        var varI = 4;
        var varJ = --varI; // El doble simbolo al ir antes de la variable, ambas variables seran afectadas
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        
        // Postdecremento
        var varK = 8;
        var varL = varK--;
        System.out.println("varK = " + varK); // Aqui va a decrementar en 1
        System.out.println("varL = " + varL);*/
        
        // Operadores de igualdad y relacional
        
        /*var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        // Operdador Diferente
        var dNum = (aNum != bNum);
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = (cadenaA == cadenaB); // Se compara la referencia no lo que hay dentro
        System.out.println("cVar = " + cVar);
        
        // Con el metodo '.equals' comparamos el contenido de las variables
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        // Operadores Realacionales
        
        var gVar = (aNum != bNum); // >, <, >=, <=, !=
        System.out.println("gVar = " + gVar); 
        
        if (aNum > bNum){
            System.out.println("El numero es mayor");
        }
        else {
            System.out.println("El numero es menor");
        }
        var edad = 20;
        var edadAdulto = 18;
        
        if (edad >= edadAdulto){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }*/
        
        // Operador Condicional 'and'
        /*var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var resultado = (valorA >= valorMinimo && valorA <= valorMaximo);
        
        if (resultado){
            System.out.println("El valor esta dentro del rango establecido");
        }
        else {
            System.out.println("El valor esta fuera del rango establecido");
        }
        
        // Operador Condicional 'or'
        var vacaciones = false;
        var diaLibre = true;
        
        if (vacaciones || diaLibre){
            System.out.println("Papa puede asistir al juego de su hijo");
        }
        else {
            System.out.println("Papa no puede asistir al juego de su hijo");
        }*/
        
        // Operador Ternario
        
       /* var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 8;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);*/
       
       // Prioridad de operadores
       
       /*var x = 5;
       var y = 10;
       var z = ++x + y--;
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 9
        System.out.println("z = " + z); // 16
        
        var solucion = 4 + 5 * 6 / 3; // 4 + ((5 * 6)/3) = 30 / 3 = 10 + 4 = 14
        System.out.println("solucion = " + solucion);
        
        solucion = (4 + 5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucion = " + solucion);*/
        
       // Ejercicio 1
       // Sacar el area y perimetro de un rectangulo
       
       var alto = 5;
       var ancho = 10;
       
       var area = alto * ancho;
       var perimetro = (alto + ancho) * 2;
       
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
        
        // Ejercicio 2
        // El mayor de dos numeros
        
        var entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero: ");
        var numero1 = entrada.nextInt();
        
        System.out.println("Digite otro numero: ");
        var numero2 = entrada.nextInt();
        
        var resultado = (numero1 > numero2) ? "El numero mayor es el: " + numero1 : "El numero mayor es el: " + numero2;
        System.out.println("resultado: " + resultado);
    }
   }