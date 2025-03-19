package ejercicio17;

public class Ejercicio17 {
    private static int metodo ( ) throws NumberFormatException{
        int valor =0;
        try {
            valor = valor +1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println ("Valor al final del try : " + valor ) ;
        }
        catch (NumberFormatException e ) {
            valor = valor + Integer.parseInt("42");
            System.out.println ("Valor al final del catch : " + valor) ;
            throw e;
        }
        finally {
            valor = valor + 1;
            System.out.println ("Valor al final de finally : " + valor) ;
        }
        valor = valor + 1;
        System.out.println ("Valor antes del return : " + valor);
        return valor;
    }

    public static void main(String[] args) {
        try {
            System.out.println (metodo ( ));
        }
        catch (Exception e) {
            System.out.println ("Excepcion en metodo ( ) " );
            e.printStackTrace ( );
        }

    }
}
