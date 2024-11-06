import java.util.Scanner;

public class Bol3_Ejer4 {

    /**
     * Comprueba si un año es bisiesto
     * 
     * @param año el año que se quiere comprobar
     * @return (true) si es bisiesto, (false) en caso contrario
     */
    public static boolean bisiesto(int año) {
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                return año % 400 == 0;
            }
            return true; // Es divisible por 4 pero no por 100
        }
        return false; // No es bisiesto si es divisible por 4
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        do {
            System.out.println("Programa que comprueba si un año es bisiesto");
            año = sc.nextInt();
            if (año != 0) {
            if (bisiesto(año)) {
                System.out.println("El año " + año + " es bisiesto");

            } else {
                System.out.println("El año " + año + " no es bisiesto");
            }
        }
        } while (año != 0);
        System.out.println("Saliendo del programa");
        sc.close();
    }
}
