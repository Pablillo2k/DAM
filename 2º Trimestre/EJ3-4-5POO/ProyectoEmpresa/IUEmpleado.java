import java.util.Scanner;

public class IUEmpleado {
    Scanner sc = new Scanner(System.in);
    //#region PROPIEDADES
    public Empleado empleado;
    
    public IUEmpleado(Empleado empleado){
        this.empleado = empleado;
    }
    //#endregion
    //#region MÉTODOS
    public void mostrar(){
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellido());
        System.out.println(empleado.getEdad());
        System.out.println(empleado.getDni());
        System.out.println(empleado.getSalarioAnual());
        System.out.println(empleado.getIrpf());
    }
    public void pedir(){
        empleado.setNombre(sc.nextLine());
        empleado.setApellido(sc.nextLine());
        empleado.setEdad(sc.nextInt());
        empleado.setDni(sc.next());
        empleado.setSalarioAnual(sc.nextDouble());
    }
    public void mostrar(int opcion){
            switch (opcion) {
                case 1:
                    System.out.printf("El nombre del empleado es %s con apellidos %s\n"
                    , empleado.getNombre(),empleado.getApellido());
                    break;
                case 2:
                    System.out.printf("El empleado tiene %d años\n"
                    , empleado.getEdad());
                    break;
                case 3:
                    System.out.printf("El DNI del empleado es %s\n"
                    , empleado.getDni());
                    break;
                case 4:
                    System.out.printf("El salario e irpf del empleado son %.2f euros y %.2f por ciento\n"
                    , empleado.getSalarioAnual(),empleado.getIrpf());
                    break;
                case 5:
                    System.out.printf("Hacienda realizara un robo de %.2f euros a este empleado\n"
                    ,empleado.hacienda());
                    break;
                default:
                    
            }
    }
    //#endregion
}
