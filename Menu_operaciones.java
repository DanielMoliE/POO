import java.util.Scanner;

public class Menu_operaciones{
    
    public static void main(String[] args) {
        System.out.println("Programa de menu de operaciones");
        
        Scanner casio = new Scanner(System.in);

        float valor1, valor2, valor3, valor4;
        double resultado, resultado2;
        int opcion;
        do{
        System.out.println("Elegir una de las opciones");
        System.out.println("1.-Calcular el perimetro y el área de un cuadrado");
        System.out.println("2.-Calcular el perimetro y el área de un triangulo");
        System.out.println("3.-Calcular el perimetro y el área de un circulo");
        System.out.println("4.-Calcular el perimetro y el área de un rectangulo");
        System.out.println("5.-Calcular el perimetro y el área de un rombo");
        System.out.println("6.-Calcular el perimetro y el área de un hexagono");
        System.out.println("7.-Salir");
        opcion = casio.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Introduce el valor de los lados del cuadrado");
                valor1 = casio.nextFloat(); 
                resultado = valor1 * valor1;
                resultado2= valor1 * 4;
                System.out.println("El perimetro del cuadrado es: "+resultado2 +" Unidades");
                System.out.println("El área del cuadrado es de: "+resultado +" Unidades cuadradas");
                break;
            case 2:
                System.out.println("Introduce la base");
                valor1 = casio.nextFloat();
                System.out.println("Introduce los otros 2 lados"); 
                valor2 = casio.nextFloat();
                valor3 = casio.nextFloat();
                System.out.println("Introduce la altura");
                valor4 = casio.nextFloat();
                resultado = (valor1 * valor4)/2;
                resultado2= valor1 + valor2 + valor3;
                System.out.println("El perimetro del triangulo es: "+resultado2 +" Unidades");
                System.out.println("El área del triangulo es: "+resultado +" Unidades cuadradas");
                break;

            case 3:
                System.out.println("Introduce el radio del circulo");
                valor1 = casio.nextFloat();
                resultado = 3.1416*(valor1*valor1);
                resultado2= 3.1416*(valor1+valor1);
                System.out.println("El perimetro del circulo: "+resultado2 + " Unidades");
                System.out.println("El área del circulo es: "+resultado + " Unidades cuadradas");
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
            case 7:
                System.out.println("Ojalá te mueras");
                break;
            default:
            System.out.println("Se acabo tu mugre programa");
            }
        }while(opcion !=7);
            
        }  
    }
     
