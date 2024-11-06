import java.util.Scanner;

public class Bol3_Ejer6 {

    /**
     * Calcula la potencia con la base (b) y el exponente (e) viendo si el exponente es positivo negativo o 0.
     * @param b parametro de la base
     * @param e parametro del exponente
     * @return devuelve el resultado de la potencia
     */
    public static double potencia(double b, int e) {
        double resultado = 1;
        int exp = Math.abs(e);

        for (int i = 0; i < exp; i++) {
            resultado *= b;
        }
        if (e < 0) {
            resultado = 1 / resultado;
        }
        return resultado;

    }
    /**
     * Muestra las potencias de la base con el exponente dado hasta n.
     * @param b parametro de la base
     * @param n parametro del exponente
     */
    public static void mostrarPotencias(double b, int n){
        for (int i = 0; i < n; i++){
            System.out.println("La potencia " + i + "  de " + b + " es: " + potencia(b, i));
        }
    }

    /**
     * Calcula la suma de las potencias de la base con el exponente dado hasta n.
     * @param valor parametro de la base
     * @param n parametro del exponente
     * @return devuelve el resultado de la suma
     */
    public static double sumaPotencias(double valor , int n){
        double suma = 0;
        for (int i = 0; i <= n; i++){
            suma += potencia(valor, i);
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la base en real y el exponente entero del número");
        double b = sc.nextDouble();
        int e = sc.nextInt();
        System.out.println(potencia(b, e));
        int n=10;
        mostrarPotencias(b,n);
        System.out.println("La suma de las potencias de " + b + " es: " + sumaPotencias(b, n));
        sc.close();
    }
}
