package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Davi Wolff
 */
public class Principal {

    public static void main(String[] args) {
        
        int numeros[] = new int[10];
        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 4;
        numeros[5] = 5;
        numeros[6] = 6;
        numeros[7] = 7;
        numeros[8] = 8;
        numeros[9] = 9;
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual índice você deseja"));
        try{
        System.out.println("tentando mostrar índice 10: " + numeros[n]); //vai dar erro, não existe índice 10
        } catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Índice fora dos limites ");
        } finally {
            System.out.println("Insira um indice dentro dos limites");
        }
    }
}
