import java.util.Scanner;

public class Bol3_Ejer10 {

    public static double Area(int base, int altura, boolean flag) {
        return flag ? base * altura : (base * altura) / 2;
        // Calcula el área según el flag
        // flag = true: área de un rectangulo
        // flag = false: área de un triangulo

    }
    
    public static double Circulo(double radio) {
        return Math.PI * (radio*radio);
        // Calcula el área de un círculo
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1.- Area de un triangulo");
            System.out.println("2.- Area de un rectángulo");
            System.out.println("3.- Area de un cuadrado");
            System.out.println("4.- Area de un círculo");
            System.out.println("5.- Salir");
            opcion = sc.nextInt();
            int base;
            int altura;
            switch (opcion) {

                case 1:
                    // Código opcion 1
                    System.out.println("Dame la base del triangulo");
                    base = sc.nextInt();
                    System.out.println("Dame la altura del triangulo");
                    altura = sc.nextInt();
                    System.out.println("El área del triangulo es: " + Area(base, altura, false));
                    break;

                case 2:
                    // Código opcion 2
                    System.out.println("Dame la base del rectangulo");
                    base = sc.nextInt();
                    System.out.println("Dame la altura del rectangulo");
                    altura = sc.nextInt();
                    System.out.println("El área del rectangulo es: " + Area(base, altura, true));

                    break;
                case 3:
                    // Código opcion 3
                    System.out.println("Dame el lado del cuadrado");
                    base = sc.nextInt();
                    System.out.println("El área del cuadrado es: " + Area(base, base, true));

                    break;
                case 4:
                    // Código opcion 4
                    System.out.println("Dame el radio del círculo");
                    double radio = sc.nextDouble();
                    System.out.println("El área del círculo es: " + Circulo(radio));

                    break;
                case 5:
                    // Código opcion 5
                    System.out.println("Hasta otra!");

                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
        sc.close();
    }
}
