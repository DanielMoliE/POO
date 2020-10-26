import java.util.Scanner;

import javax.swing.JOptionPane;

public class Holamundo {
 
     public static void main(String[] args) {
        System.out.println("Hola mundo");
        long caca = 10;
        caca = 15;
        System.out.println("numero "+caca);
        final float caca2 = 1.25f;
        System.out.println("numero "+caca2);
        char cacaracter = 'a';
        System.out.println("caracter "+cacaracter);
        Integer caca3 = null;
        System.out.println("valor "+caca3);
        String cacalenguaje = "Milanesa";
        System.out.println("palabra "+cacalenguaje);
        Scanner Balu = new Scanner(System.in);
        
        
        String cadena;
        int entero;
        Double decimalp;
        float decimal;

        cadena = JOptionPane.showInputDialog("Introduzca una cadena ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un entero"));
        decimalp = Double.parseDouble(JOptionPane.showInputDialog("Intudoce un numero decimal"));
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Introduce un decimal "));

        JOptionPane.showMessageDialog(null, "Tu cadena es "+cadena);
        JOptionPane.showMessageDialog(null, "Tu entero es "+entero);
        JOptionPane.showMessageDialog(null, "Tu decimal es "+decimalp);
        JOptionPane.showMessageDialog(null, "Tu decimal 2 es "+decimal);

        Float caca4;
        System.out.println("Introduce un valor");
            caca4 = Balu.nextFloat();
        System.out.println("Tu valor "+caca4);
        char caca5;
        System.out.println("Introduce una letra");
            caca5 = Balu.next().charAt(0);
            System.out.println("Tu letra es "+caca5);

    }
}
