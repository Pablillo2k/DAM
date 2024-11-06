import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Bol3_Ejer7 {
    /**
     * Funcion que inicializa una funcion para llamar a un archivo y devuelve el archivo entero en forma de String
     * @param archivo Las lineas que lee de un archivo
     * @return Devuelve todas las lineas en forma de String
     * @throws FileNotFoundException
     */
    public static String saveFile(String archivo) throws FileNotFoundException {
        //Crea el archivo para leerlo
        File file = new File(archivo);
        Scanner f = new Scanner(file);
        while (f.hasNextLine()) {
            archivo += f.nextLine() + "\n";
        }
        f.close();
        return archivo;
    }
    /**
     * Funcion que lee el archivo usando la funcion anterior y le añade nuevas lineas de texto sin borrar las anteriores
     * @param archivo El archivo que lee de la funcion anterior
     * @param newText El nuevo texto añadido al archivo
     * @throws FileNotFoundException
     * @throws IOException
     */
    //Lee el archivo, concatena el nuevo texto y lo guarda de nuevo
    public static void appendFile(String archivo, String newText) throws FileNotFoundException, IOException {
        //Lee el archivo usando la anterior función
        String currentContent = saveFile(archivo);
        // Concatena el nuevo texto al contenido actual
        currentContent += newText;
        // Escribe el archivo con el contenido actualizado
        FileWriter writer = new FileWriter(archivo);
        writer.write(currentContent);
        writer.close();
    }
    /**
     * Funcion que Lee el archivo y concatena el nuevo texto sin sobreescribir lo anterior 
     * @param archivo El archivo que lee
     * @param newText El nuevo texto que añade al archivo
     * @throws IOException
     */
    //Lee el archivo, concatena el nuevo texto y lo guarda de nuevo
    public static void appendFile2(String archivo, String newText) throws IOException {
        // Abre el archivo en modo añadir (true) para que se escriba al final del archivo sin sobreescribir lo anterior
        FileWriter writer = new FileWriter(archivo, true);
        writer.write(newText);
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        // Probar saveFile
        String archivoContenido = saveFile("Ej1.txt");
        System.out.println("Contenido del archivo:\n" + archivoContenido);
        // Probar appendFile2
        appendFile2("Ej1.txt", "\nEste es el texto que se añadirá al final del archivo\n");
        System.out.println("Contenido del archivo después de agregar con appendFile2:\n" + saveFile("Ej1.txt"));
        // Probar appendFile
        appendFile("Ej1.txt", "\nTexto añadido al final\n");
        System.out.println("Contenido del archivo después de agregar con appendFile:\n" + saveFile("Ej1.txt"));
    }
}
