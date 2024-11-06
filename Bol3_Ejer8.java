import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Bol3_Ejer8 {
    /**
     * Funcion que a partir de un numero determinado devuelve true en caso de que sea primo y false en caso de que no lo sea
     * @param n el numero a partir del cual se hace la comprobacion
     * @return true si es primo o false si no lo es
     */
    public static boolean Primo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Dime un numero mayor que 2");
        // Apertura
        Scanner sc = new Scanner(System.in);

        PrintWriter f = new PrintWriter("Ej8.txt");
        // Escritura
        for (int i = 3; i <= 100; i++) {
            f.print(i + "\n");
        }

        int num = sc.nextInt();
        while (num <= 2) {
            System.out.println("Dime un numero mayor que 2");
            num = sc.nextInt();
        }
        for (int i = 2; i <= num; i++) {
            if (Primo(i)) {
                System.out.print(i + " ");
            }
        }
        int opcion;
        System.out.println("\nElige una opción");
        do {
            System.out.println("1.- Mostrar primos menores que uno dado");
            System.out.println("2.- Primos en archivo");
            System.out.println("3.- Archivo con primos");
            System.out.println("4.- Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Código opcion 1
                    System.out.println("Dame un número para enseñar todos los primos menores que el");
                    num = sc.nextInt();
                    while (num < 1) {
                        System.out.println("Dime un numero mayor que 1");
                        num = sc.nextInt();
                    }
                    for (int i = num; i > 1; i--) {
                        if (Primo(i)) {
                            System.out.print(i + "\n");
                            f.print(i + " \n");
                        }
                    }
                    f.close();
                    break;
                case 2:
                    PrintWriter w = new PrintWriter("Ej9.txt");
                    // Código opcion 2
                    System.out.println("Esta opción lee los numeros del archivo y dice si son primos o no");
                    for (int i = 2; i <= 100; i++) {
                        w.print(i + "\n");
                    }
                    w.close();
                    Scanner l = new Scanner(new File("Ej9.txt"));
                        int n;
                        while (l.hasNextInt()) {
                            n = l.nextInt();
                            if (Primo(n)) {
                                System.out.println(n + " es primo");
                            } else {
                                System.out.println(n + " no es primo");
                            }
                        }
                    l.close();
                    break;
                case 3:
                    PrintWriter p = new PrintWriter("Ej8.txt");
                    // Código opcion 3
                    System.out.println("Introduce el numero tope hasta el que quieres calcular los primos");
                    System.out.println("Dame un número");
                    num = sc.nextInt();
                    while (num < 2) {
                        System.out.println("Dime un numero mayor que 2");
                        num = sc.nextInt();
                    }
                    for (int i = 2; i <= num; i++) {
                        if (Primo(i)) {
                            p.print(i + ";");
                        }
                    }
                    p.close();
                    break;
                case 4:
                    // Código opcion 4
                    System.out.println("Hasta otra!");

                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 4);
        // Cierre
        sc.close();

    }
}
