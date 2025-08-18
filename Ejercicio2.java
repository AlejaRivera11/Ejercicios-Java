import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = sc.nextLine();

        
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();


        System.out.println("Su forma invertida es: " + cadenaInvertida);

    }
}
