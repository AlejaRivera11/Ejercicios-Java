import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese una palabra en minúsculas: ");
        String palabra = sc.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } 
            
            else {
                consonantes++;
            }
        }

        // Mostrar resultados
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

    }
}
