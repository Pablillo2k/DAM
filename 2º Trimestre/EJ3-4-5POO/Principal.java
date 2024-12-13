import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado e = new Empleado();
        System.out.println("Los datos del empleado son");
        IUEmpleado iue = new IUEmpleado(e);
        iue.pedir();
        iue.mostrar(1);
        iue.mostrar(2);
        iue.mostrar(3);
        iue.mostrar(4);
        iue.mostrar(5);
        sc.close();
    }
}
