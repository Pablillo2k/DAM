import java.util.Scanner;
import java.io.PrintWriter;

public class Bol3_Ejer1 {

    /**
     * Muestra de n lineas en pantalla
     * @param n El numero de lineas que se mostrara
     */
    public static void lineasN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }
    /**
     * Comprueba si un numero es par o no
     * @param n El numero que se comprueba
     * @return La respuesta de si es par (true) o no (false)
     */
    public static boolean par(int n) {
        if (n % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }
    /**
     * Comprueba si un numero es positivo o negativo
     * @param n numero que comprueba
     * @return la respuesta de si es positivo (P) o negativo (N)
     */
    public static char positivo(int n) {
        return n > 0 ? 'P' : 'N';

    }

    public static void main(String[] args) throws Exception {
        //Apertura
        PrintWriter f= new PrintWriter("Ej1.txt");
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre:");
        String nombre=sc.nextLine();
        lineasN(10);
        System.out.println("Dime un número");
        int n = sc.nextInt();
        System.out.println(par(n));
        System.out.println(positivo(n));
        
        //Escritura archivo
        
        f.println(nombre);
        f.println(n);
        f.print(positivo(n));
        f.println(par(n));
        
        //Cierre
        
        f.close();
        sc.close();
        
    }
}
