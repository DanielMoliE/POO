/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.Scanner;

/**
 *
 * @author lepix
 */
public class Peperonni extends Pizza{
    public Peperonni() {
    }

    public Peperonni(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        //opciones de peperoni
        //rodajas, rodajas y parmesano, rodajas y albaca, doble
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas con Parmesano";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[4] = "Doble Peperoni en Rodajas";
        
    }
    public String elegirtamano(){
                    Scanner entrada2 = new Scanner(System.in);
            int tamano;
            System.out.println("¿Cuantas pizzas desea comprar?");
            int valor1 = entrada2.nextInt();
             int c3=96*valor1,m3=119*valor1,g3=131*valor1,f3=167*valor1;
            System.out.println("Elije el tamaño de tus pizzas (ordene por lo menos 1)");
            System.out.println("1.- Chica "+c3/valor1+"$");        
            System.out.println("2.-Mediana "+m3/valor1+"$");    
            System.out.println("3.-Grande "+g3/valor1+"$");
            System.out.println("4.-Familiar "+f3/valor1+"$");
            tamano = entrada2.nextInt();
            String t = String.valueOf(tamano);
            if (tamano==1){
                System.out.println("La pizza se corta en 4 partes iguales");
                System.out.println("La cantidad a pagar es de "+c3+"$");
            }
            else if(tamano==2){
                System.out.println("La pizza se corta en 8 partes iguales");
                System.out.println("La cantidad a pagar es de "+m3+"$");
            }
            else if(tamano==3){
                System.out.println("La pizza se corta en 12 partes iguales");
                System.out.println("La cantidad a pagar es de "+g3+"$");
            }
            else if(tamano==4){
                System.out.println("La pizza se corta en 16 partes iguales");
                System.out.println("La cantidad a pagar es de "+f3+"$");
            }
            return t;
            }
    }

