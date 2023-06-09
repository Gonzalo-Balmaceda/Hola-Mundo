package clase7;
public class Clase7 {
    public static void main(String[] args) {
        
        //Operadores Aritmeticos. 
        
        /*int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("La solucion de la suma es = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("La solucion de la resta es = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("La solucion de la multiplicacion es = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("La solucion de la division es = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);
        
        solucion = num1 % num2;
        System.out.println("solucion = " + solucion);
        
        if (num2 % 2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El resultado es impar");*/
        
        //Operadores de asignacion.
        
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; //Una operacion
        System.out.println("varNum3 = " + varNum3);
        
        //Operador de composicion
        varNum1 += 1; // Es igual a (varNum1 = varNum1 + 1;)
        System.out.println("varNum1 = " + varNum1);
        
        //Resta
        var num = 5;
        num -= 1; // = 4
        System.out.println("num = " + num);
        
        //Multiplicacion
        var num1 = 5;
        num1 *= 2; // = 10
        System.out.println("num1 = " + num1);
        
        //Division
        var num2 = 10;
        num2 /= 2; // = 5
        System.out.println("num2 = " + num2);
        
        //Modulo
        var num3 = 7;
        num3 %= 2; // = 1
        System.out.println("num3 = " + num3);
    }
    
}
