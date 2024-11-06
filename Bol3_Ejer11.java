import java.util.Scanner;

public class Bol3_Ejer11 {

    public static double factorial (int nums){
        Scanner sc = new Scanner(System.in);
        nums = 1;
        for (int i = sc.nextInt(); i > 1; i--) {
            nums = nums * i;
            System.out.println(nums);
        }
        return nums;
        
    }
    //Aproximación de Taylor con funcion factorial y potencia
    public static double aproximacionTaylor(int x, double n) {
        double resultado = 0;
        for (int i = 0; i <= n; i = i+2) {
            resultado = 1 - (Bol3_Ejer6.potencia(x, i) / factorial(i));
        }
        return resultado;

    }
    public static void main(String[] args) {

    }
}
