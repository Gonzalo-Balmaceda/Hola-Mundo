package clase5;

public class Clase5 {

    public static void main(String[] args) {
        
         //Inferencias de tipo var y tipos primitivos.
        
        /*var numEntero = 20; //Las literales sin puntos automaticamente son de tipo int.
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //Con el punto automaticamente se transforma en un tipo double.
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        
        //Tipo primitivo char.
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        char varCaracter = '\u0024'; //Indicamos a java la asiganacion con el codigo unicode.
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Valor decimal del juego de caracter unicode.
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //Un caracter especial, podemos copiar y pegar desde unicode.
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        var miVariableChar1 = 'a';
        System.out.println("miVariableChar1 = " + miVariableChar1);
        var varCaracter1 = '\u0024'; //Indicamos a java la asiganacion con el codigo unicode.
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; //Valor decimal del juego de caracter unicode.
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; //Un caracter especial, podemos copiar y pegar desde unicode.
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
    }
    
}
