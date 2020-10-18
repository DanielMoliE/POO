import java.util.Scanner;

public class Menu_operaciones{
    public static void main(String[] args) {
        System.out.println("Programa de menu de operaciones");
        
        Scanner casio = new Scanner(System.in);

        float valor1, valor2, resultado;
        int opcion;

        System.out.println("Elegir una de las opciones");
        System.out.println("1.-Sumar numeros");
        System.out.println("2.-Restar numeros");
        opcion = casio.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Introduce los numeros a sumar");
                valor1 = casio.nextFloat(); 
                valor2 = casio.nextFloat();
                resultado = valor1 + valor2;
                System.out.println("La suma de los dos numeros es de: "+resultado);
                break;
            case 2:
                System.out.println("Introduce los numeros a restar");
                valor1 = casio.nextFloat(); 
                valor2 = casio.nextFloat();
                resultado = valor1 - valor2;
                System.out.println("La resta de los 2 numeros es de: "+resultado);
                break;

        default: 
            System.out.println("Se acabo tu mugre programa");
        }  
    }
     
}
