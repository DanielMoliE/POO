import java.util.*;

public class Buscaminas{

    Scanner AQUA = new Scanner(System.in);
    
    int arr [][] = new int[15][15];
    double abc=0, fgh=0;
    int valor1=0, valor2=100, minasent=10;

    public void tablero(Scanner entrada){

        for(int j=0; j<15;j++)
        for(int i=0; i<15;i++)
            arr[j][i]=0;
        do{
            abc=Math.random()*15;
            fgh=Math.random()*15;
            abc=(int)abc;
            fgh=(int)fgh;
            if(fgh!=0 && abc!=0 && fgh!=15-1 && abc!=15-1){
                arr[(int)abc][(int)fgh]=1;
                valor1++;
            }
        }while(valor1<=10);

        //for(int xx=0;xx<15;xx++)
        //for(int yy=0;yy<15;yy++)
        //    if(tablero [xx][yy]==1)
        //    System.out.println("Fila "+(xx+1)+" columna "+(yy+1));
        
        System.out.println("  Ingresa las coordenas en el rango del 1 al 15");
       	do {
       		int i=0,j=0;
       		int minassobrep = 0;
            
           do{
       			 System.out.println("\n	Intento :"+valor2+" , Cual es su coordenada? \n");
       			 System.out.print("		Introduzca la fila:  ");
       			 i=AQUA.nextInt();
       			 System.out.println();
       			 System.out.print("		Intrduzca la columna:  ");
       			 j=AQUA.nextInt();
       			 
       			 if(i==0 || j==0 || i>15 || j>15)
       			 	System.out.println("\nSEA OBEDIENTE E INTRODUZCA VALORES DEL 1 AL 15 PORFAVOR uwu"); 
            }while(i==0 || j==0 || i>15 || j>15);
            i=i-1;
            j=j-1;

            if(arr [i][j]==0){

                if (i==0&&j==0){
       				if(i+1>=0 && i+1<15 && j<15)
       					minassobrep=minassobrep+arr [i+1][j];
       				if(i+1>=0 && i+1<15 && j+1<15 && j+1>=0)
       					minassobrep=minassobrep+arr [i+1][j+1];
       				if(i>=0 && i<15 && j+1<15 && j+1>= 0)
       					minassobrep=minassobrep+arr [i][j+1];
       			}
       			else {
       				if(j==0){
       					if(i+1>=0 && i+1<15 && j<15)
       						minassobrep=minassobrep+arr [i+1][j];
       					if(i-1>=0 && i-1<15 && j<15)
       						minassobrep=minassobrep+arr [i-1][j];
       					if(i-1>=0 && i-1<15 && j+1<15 && j+1>=0)
       						minassobrep=minassobrep+arr [i-1][j+1];
       					if(i>=0 && i<15 && j+1<15 && j+1>= 0)
       						minassobrep=minassobrep+arr [i][j+1];
       					if(i+1>=0 && i+1<15 && j+1<15 && j+1>=0)
       						minassobrep=minassobrep+arr [i+1][j+1];
       					
       				}
       				else{
       					if(i-1>=0 && i-1<15 && j-1<15)
       						minassobrep=minassobrep+arr [i-1][j-1];
       					if(i>=0 && i<15 && j-1<15)
       						minassobrep=minassobrep+arr [i][j-1];
       					if(+1>=0 && i+1<15 && j-1<15)
       						minassobrep=minassobrep+arr [i+1][j-1];
       					if(i+1>=0 && i+1<15 && j<15)
       						minassobrep=minassobrep+arr [i+1][j];
       					if(i-1>=0 && i-1<15 && j<15)
       						minassobrep=minassobrep+arr [i-1][j];
       					if(i-1>=0 && i-1<15 && j+1<15 && j+1>=0)
       						minassobrep=minassobrep+arr [i-1][j+1];
       					if(i>=0 && i<15 && j+1<15 && j+1>= 0)
       						minassobrep=minassobrep+arr [i][j+1];
       					if(i+1>=0 && i+1<15 && j+1<15 && j+1>=0)
       						minassobrep=minassobrep+arr [i+1][j+1];
       					}
       			 }
                    
                if(valor2>0)
                System.out.print("\nEspacio vacio,");
                System.out.print(" Alrededor hay: "+minasent);
                System.out.println("\n Intentos restantes: "+(valor2-1));
                valor2=valor2-1;
                }else{
                minasent = minasent-1;
                System.out.println("\nAcertaste!, Mina Eliminada, Restan "+minasent+" Minas");
                }

    }while(valor2>0 && valor2>0 && minasent>0);

    if(minasent==0)
        System.out.println("		GANASTE! :D");

    if(valor2==0)
       	System.out.println("		PERDISTE!");    
    }
    public static void main(String[] args){
        Buscaminas buscaminas = new Buscaminas();
        Scanner entrada = new Scanner(System.in);
        buscaminas.tablero(entrada);
    }
}
