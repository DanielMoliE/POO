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
public class Vegetariana extends Pizza{
        public Vegetariana() {
    }

    public Vegetariana(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Champiñones";
        this.ingredientes[1] = "Piña";
        this.ingredientes[2] = "Pimiento";
        this.ingredientes[3] = "Elote";

    }
        public String elegirtamano3(){
                    Scanner entrada2 = new Scanner(System.in);
            int tamano;
            System.out.println("¿Cuantas pizzas desea comprar?");
            int valor3 = entrada2.nextInt();
            int c3=96*valor3,m3=119*valor3,g3=131*valor3,f3=167*valor3;
            System.out.println("Elije el tamaño");
            System.out.println("1.- Chica "+c3/valor3+"$");        
            System.out.println("2.-Mediana "+m3/valor3+"$");    
            System.out.println("3.-Grande "+g3/valor3+"$");
            System.out.println("4.-Familiar "+f3/valor3+"$");
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
