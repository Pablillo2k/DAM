import java.util.Scanner;

public class Bol2_Ejer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para calcular su factorial");
        double nums = 1;
        for (double i = sc.nextDouble(); i > 1; i--) {
            nums = nums * i;
            System.out.println(nums);
        }

        System.out.println("introduce otro");
        double a = sc.nextDouble();
        nums = 1;

        do {
            nums = nums * a;
            System.out.println(nums);
            a--;

        } while (a > 1);

        System.out.println("introduce otro");
        double b = sc.nextDouble();
        nums = 1;

        while (b > 1) {
            nums = nums * b;
            System.out.println(nums);
            b--;
        }

    }
}
