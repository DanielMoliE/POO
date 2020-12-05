/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.*;
import Pizza.*;

public class Queso extends Pizza{
     public Queso() {
    }

    public Queso(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[2];
        this.ingredientes[0] = "Parmesano";
        this.ingredientes[1] = "Mozzarela";
    }

    //queremos elegir un tipo de queso
    public String elegirtipoqueso(){
        //es un metodo void, o string?
        
        Scanner entrada = new Scanner(System.in);
        int queso;
        System.out.println("Elije el queso que deseas");
        System.out.println("1.- Parmesano");
        System.out.println("2.- Mozzalera");
        queso = entrada.nextInt();
        if (queso==1){
    
            Scanner entrada2 = new Scanner(System.in);
            System.out.println("¿Cuantas pizzas deses comprar?");
            int valor2 = entrada2.nextInt();
            int tamano;
            int c1=75*valor2,m1=89*valor2,g1=112*valor2,f1=135*valor2;
            System.out.println("Elije el tamaño");
            System.out.println("1.- Chica "+c1/valor2+"$");        
            System.out.println("2.-Mediana "+m1/valor2+"$");    
            System.out.println("3.-Grande "+g1/valor2+"$");
            System.out.println("4.-Familiar "+f1/valor2+"$");
            tamano = entrada2.nextInt();
            String t2 = String.valueOf(tamano);
            if (tamano==1){
                System.out.println("La pizza se corta en 4 partes iguales");
                System.out.println("La cantidad a pagar es de "+c1+"$");
            }
            else if(tamano==2){
                System.out.println("La pizza se corta en 8 partes iguales");
                System.out.println("La cantidad a pagar es de "+m1+"$");
            }
            else if(tamano==3){
                System.out.println("La pizza se corta en 12 partes iguales");
                System.out.println("La cantidad a pagar es de "+g1+"$");
            }
            else if(tamano==4){
                System.out.println("La pizza se corta en 16 partes iguales");
                System.out.println("La cantidad a pagar es de "+f1+"$");
            }
            return t2;
            }
        if (queso==2){
           Scanner entrada3 = new Scanner(System.in);
            int tamano2;
            System.out.println("¿Cuantas pizzas desea comprar?");
            int valor2 = entrada3.nextInt();
            int c2=89*valor2,m2=115*valor2,g2=135*valor2,f2=175*valor2;
            System.out.println("Elije el tamaño");
            System.out.println("1.- Chica "+c2/valor2+"$");        
            System.out.println("2.-Mediana "+m2/valor2+"$");    
            System.out.println("3.-Grande "+g2/valor2+"$");
            System.out.println("4.-Familiar "+f2/valor2+"$");
            tamano2 = entrada3.nextInt();
            String t2 = String.valueOf(tamano2);
            if (tamano2==1){
                System.out.println("La pizza se corta en 4 partes iguales");
                System.out.println("La cantidad a pagar es de "+c2+"$");
            }
            else if(tamano2==2){
                System.out.println("La pizza se corta en 8 partes iguales");
                System.out.println("La cantidad a pagar es de "+m2+"$");
            }
            else if(tamano2==3){
                System.out.println("La pizza se corta en 12 partes iguales");
                System.out.println("La cantidad a pagar es de "+g2+"$");
            }
            else if(tamano2==4){
                System.out.println("La pizza se corta en 16 partes iguales");
                System.out.println("La cantidad a pagar es de "+f2+"$");
            }
            return t2;
        }
        String q = String.valueOf(queso);
        return q;
    }

}