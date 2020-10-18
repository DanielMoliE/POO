import java.util.Scanner;

public class Menu_operaciones{
    public static void main(String[] args) {
        System.out.println("Programa de menu de operaciones");
        
        Scanner casio = new Scanner(System.in);

        float valor1, valor2, resultado;

        
        System.out.println("Introduce los numeros a sumar");
        valor1 = casio.nextFloat(); 
        valor2 = casio.nextFloat();
        resultado = valor1 + valor2;
        System.out.println("La suma de los dos numeros es de: "+resultado);  
    }
     
}
