import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Bol3_Ejer5 {
    public static void main(String[] args) throws Exception {   
        Scanner sc = new Scanner(System.in);

        // Apertura
        PrintWriter f = new PrintWriter("Ej5.txt");

        System.out.println("Dime un año");

        // Escritura

        int año = sc.nextInt();
        if (Bol3_Ejer4.bisiesto(año)) {
            f.println(año + " Es bisiesto");
        } else {
            f.println(año + " No es bisiesto");
        }

        for (int i = año+1; i <= 2024; i++) {
            if (Bol3_Ejer4.bisiesto(i)) {
                System.out.println(i);
                f.print(i);
                // f.println(" Es bisiesto");
            }
        }
        // Cierre
        f.close();

        Scanner l = new Scanner(new File("Ej5.txt"));
        String linea;
        if (l.hasNextLine()) {
            l.nextLine();
        }
        
        while (l.hasNextInt()) {
            linea = l.nextLine();
            System.out.printf("%6s, ",linea);
        }
        l.close();
        sc.close();


    }
}
