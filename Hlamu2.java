import java.util.*;

public class Hlamu2 {
    public static void main(String[] args){
        
        Scanner lector = new Scanner(System.in);
        double w=0, z=0;
        w=Math.random()*9;
        z=Math.random()*9;
        w=(int)w;
        z=(int)z;


        
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.print(" 0");
            }
            System.out.println("");
        }
        double mimi = 89.124;
        long res = Math.round(mimi);
        int ede =2;
        
        System.out.println("Redondeando a "+mimi);
        System.out.println("Obtenemos: "+res);

        double rara = Math.random();
        System.out.println(rara);
        double sasa = Math.sqrt(mimi);
        System.out.println(sasa);
        double sase = Math.pow(mimi, 2);
        System.out.println(sase);

        double susu = mimi + mimi;
        System.out.println("\n la mimisuma es "+susu);

        if(mimi+ede == ede+mimi){
            System.out.println("Balu no esta bien");
        }
        else {
            System.out.println("Balu es el mejor perro del mundo");
        }
    }
}
