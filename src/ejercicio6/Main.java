package ejercicio6;/*
 * Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente
acción:
Recibe como parámetros una cadena (String) y un entero (int);
Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del método “length():
int” de la clase “String”) devuelve el carácter en la posición correspondiente (puedes hacer
uso del método “charAt(int)” de la clase “String”).
En caso contrario, construye y lanza una excepción de tipo “Exception”
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase;
        int indice;
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Introduce una frase:");
            frase = scn.nextLine();
            System.out.println("Introduce un indice para obtener el caracter: ");
            indice = scn.nextInt();
            System.out.println("El caracter en la posicion " + indice + " es: " + caracterEn(frase, indice));
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
    static char caracterEn(String cadena, int indice) throws Exception{
        if(indice > 0 && indice < cadena.length()){
            return cadena.charAt(indice);
        }
        throw new Exception("indice fuera de rango");
    }
}