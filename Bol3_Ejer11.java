import java.util.Scanner;

public class Bol3_Ejer11 {

    /**
     * Funcion que  calcular su factorial
     * @param nums el número a propcesar
     * @return el resultado del factorial
     */
    public static long factorial(int nums) {
        nums = 1;
        for (int i = nums; i > 1; i--) {
            nums = nums * i;
           // System.out.println(nums);
        }
        return nums;
    }

    // Aproximación de Taylor con funcion factorial y potencia
    /*
     * Funcion que hace el cálculo de la aproximación Taylor segun dos variables que
     * introduces, la primera corresponde al valor de las X en el dividendo y la
     * segunda corresponde tanto al valor de los exponentes como al valor de los Factoriales
     * 
     * Calcula una paroximacin del coseno
     * @param la x angulo en radianes
     * @return el resultado de hacer la cuenta de la aproximacion Taylor
     */
    public static double aproximacionTaylor(double x, int n) {
        double resultado = 0;
        for (int i = 0; i <= n; i = i += 2) {
            resultado = 1 - (Bol3_Ejer6.potencia(x, i) / factorial(i));  // OJO, se alternan sumas y restas
        }
        return resultado;
    }

    public static void main(String[] args) {// TODO comparar resultados con Math.cos
        Scanner sc = new Scanner(System.in);
        double resultado;
        for (double x = 0.1; x <= 1; x = x+0.1) {
            resultado = aproximacionTaylor(x, 4);
            System.out.printf("Coseno de %.1f es %8.5f \n",x,resultado);
        }
        sc.close();
    }
}
// 11. a) Realizar una función que devuelva el factorial de un número seg ún se
// definió en el boletín anterior (recuerda que 0!=1). Hazlo con parámetro int pero
// que devuelva double o long.
// b) El cálculo del coseno de un ángulo se puede aproximar por el siguiente cálculo
// (aproximación de Taylor):
// cos(x)=1−(x**2/!2)+(x**4/!4)...

// Realizar un método que realice y devuelva dicho cálculo (hazlo al menos hasta el
// termino de potencia 4. Si quiere mete más). Debes usar la función factorial hecha
// en el apartado anterior y la de potencia hecha en un ejercicio previo.
// c) Realizar un programa que muestre por pantalla los cosenos de los ángulos de 0.1
// , 0.2, y hasta 1 radian. Además en cada línea mostrará el resultado del coseno
// según tu función y el error absoluto obtenido de restarlo de la función Math.cos().
// Usa 5 decimales de aproximación para todo y que los valores ocupen 8 posiciones.
// Opcional: Realiza la función factorial aplicando recursividad (ver apéndice de
// apuntes, evita buscar en internet).