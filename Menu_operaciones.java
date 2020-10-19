import java.util.Scanner;

public class Menu_operaciones{
    public static void main(String[] args) {
        System.out.println("Programa de menu de operaciones");
        
        Scanner casio = new Scanner(System.in);

        float valor1, valor2;
        double resultado;
        int opcion;

        System.out.println("Elegir una de las opciones");
        System.out.println("1.-Calcular el área de un cuadrado");
        System.out.println("2.-Calcular el área de un triangulo");
        System.out.println("3.-Calcular el área de un circulo");
        System.out.println("4.-Calcular el área de un rectangulo");
        System.out.println("5.-Calcular el área de un rombo");
        System.out.println("6.-Calcular el área de un hexagono");
        opcion = casio.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Introduce el valor de los lados del triangulo");
                valor1 = casio.nextFloat(); 
                resultado = valor1 * valor1;
                System.out.println("El área del cuadrado es de: "+resultado +" Unidades cuadradas");
                break;
            case 2:
                System.out.println("Introduce la base y la altura del triangulo");
                valor1 = casio.nextFloat(); 
                valor2 = casio.nextFloat();
                resultado = (valor1 * valor2)/2;
                System.out.println("El área del triangulo es: "+resultado +" Unidades cuadradas");
                break;

            case 3:
                System.out.println("Introduce el radio del circulo");
                valor1 = casio.nextFloat();
                resultado = 3.1416*(valor1*valor1);
                System.out.println("El área del triangulo es: "+resultado + " Unidades cuadradas");
                break;
            case 4:
                System.out.println("Introduce la base y la altura del rectangulo");
                valor1 = casio.nextFloat();
                valor2 = casio.nextFloat();
                resultado= valor1 * valor2;
                System.out.println("El área del rectangulo es: "+resultado + " Unidades cuadradas");
                break;
            case 5:
                System.out.println("Introduce la distancia mayor y la distancia menor del rombo");
                valor1 = casio.nextFloat();
                valor2 = casio.nextFloat();
                resultado= (valor1 * valor2)/2;
                System.out.println("El área del rectangulo es: "+resultado + " Unidades cuadradas");
                break;
            case 6:
                System.out.println("Introduce el perimetro y el apotema del hexagono");
                valor1 = casio.nextFloat();
                valor2 = casio.nextFloat();
                resultado= (valor1*valor2)/2;
                System.out.println("El área del hexagono es: "+resultado + " Unidades cuadradas");
                default: 
            System.out.println("Se acabo tu mugre programa");
        }  
    }
     
}
