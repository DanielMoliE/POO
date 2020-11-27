import java.util.*;

public class Ejercicio1MolinaEscobarDaniel {
    public static void main(String[] args){

        System.out.println("Convertidor de grados celsius a grados farenheit");
        Scanner lector = new Scanner(System.in);
        System.out.println("\nIntroduce la cantidad de grados celsius a convertir");
        Double valor = lector.nextDouble();
        Double Resultado = 32 +(9*valor / 5);
        System.out.println("Su valor en grados farenheit "+Resultado +"°");

    }
}
