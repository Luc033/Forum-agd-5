/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forum.agd5;

/**
 *
 * @author morta
 */import javax.swing.JOptionPane;
public class ForumAgd5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1;
        int valor2;
          
     valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor."));
     valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor."));
       
     if (valor1 == valor2){
       JOptionPane.showMessageDialog(null,valor1 + valor2);
     } else{
           JOptionPane.showMessageDialog(null, valor1 * valor2);
}       




    }
    
}
