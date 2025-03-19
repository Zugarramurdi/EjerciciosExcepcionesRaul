package ejercicio8;

public class NumeroNegativoException extends Exception{
    public NumeroNegativoException() {
        super("El indice introducido no es valido");
    }
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }

}
