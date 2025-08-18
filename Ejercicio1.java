
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n2 = sc.nextInt();
        
        int opcion;
        int resultado;
        
        System.out.println("\nOperaciones aritmeticas");
        System.out.println("M E N U   D E   O P C I O N E S");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        
        System.out.println("\nDigite una opcion para realizar la operacion");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                resultado = n1 + n2;
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("La resta es: " + resultado);
                break;   
            case 3:
                resultado = n1 * n2;
                System.out.println("La multiplicacion es: " + resultado);
                break;  
            case 4:
                resultado = n1 / n2;
                    System.out.println("La divicion es: " + resultado);
                    break; 
                     
            default:
                System.out.println("Opcion no valida por favor verificar");                         
        }
        
    
    }
}
