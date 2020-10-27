import java.util.Scanner;

public class ExamenpracticoPOOMolinaEscobarDaniel{

    public static void main(String[] args){
        System.out.println("Pokedex");
        Scanner lector = new Scanner(System.in);

        int opcion;
        do{
        System.out.println("Elija a donde quiere ingresar");
        System.out.println("1.-Datos de charmander");
        System.out.println("2.-Datos de bulbasaur");
        System.out.println("3.-Datos de squartle");
        System.out.println("4.-Batalla pokemon");
        System.out.println("5.-Salir de la pokedex");
        opcion = lector.nextInt();

        switch (opcion){
            case 1:{
                do{
                    System.out.println("Charmander");
                    int id1 = 1;
                    System.out.println("ID: "+id1);
                    String charman = "Charmander";
                    System.out.println("Nombre: "+charman);
                    final int f1 = 18;
                    System.out.println("Fuerza = "+f1);
                    final int def1 = 10;
                    System.out.println("Defensa = "+def1);
                    final double HP1 = 32;
                    System.out.println("HP = "+HP1);
                    String atac1 = "Arañazo";
                    System.out.println("Ataque principal: "+atac1);
                    String atac2 = "Ascuas";
                    System.out.println("Ataque secundario: "+atac2);
                    System.out.println("Para ir a el siguiente pokemon presione 1");
                    opcion = lector.nextInt();
                    break;
                }while(opcion !=1);
            }
            case 2:{
                do{
                    System.out.println("Bulbasaur");
                    int id2 = 2;
                    System.out.println("ID: "+id2);
                    String bulba = "Bulbasaur";
                    System.out.println("Nombre: "+bulba);
                    final int f2 = 14;
                    System.out.println("Fuerza = "+f2);
                    final int def2 = 16;
                    System.out.println("Defensa = "+def2);
                    final double HP2 = 36;
                    System.out.println("HP = "+HP2);
                    String atab1 = "Placaje";
                    System.out.println("Ataque principal: "+atab1);
                    String atab2 = "Latigo cepa";
                    System.out.println("Ataque secundario: "+atab2);
                    System.out.println("Para ir al siguiente pokemon presione 2");
                    opcion = lector.nextInt();
                    break;
                }while(opcion !=2);
            }
            case 3:{
                do{
                    System.out.println("Squartle");
                    int id3 = 3;
                    System.out.println("ID: "+id3);
                    String squirt = "Squartle";
                    System.out.println("Nombre: "+squirt);
                    final int f3 = 12;
                    System.out.println("Fuerza = "+f3);
                    final int def3 = 20;
                    System.out.println("Defensa = "+def3);
                    final double HP3 = 37;
                    System.out.println("HP = "+HP3);
                    String atas1 = "Malicioso";
                    System.out.println("Ataque principal: "+atas1);
                    String atas2 = "Pistola agua";
                    System.out.println("Ataque secundario: "+atas2);
                    System.out.println("Para volver presione 3");
                    opcion = lector.nextInt();
                    break;
                }while(opcion !=3);
            }

                 
                




                
            }





        }while(opcion !=5);



    }
    
}
