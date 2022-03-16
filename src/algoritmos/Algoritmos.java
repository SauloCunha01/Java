package algoritmos;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Algoritmos {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int n1, sucessor, antecessor;       
  n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor"));
       sucessor = ++n1;
       antecessor = --n1;
       JOptionPane.showMessageDialog(null,"Sucessor:"+sucessor);
       JOptionPane.showMessageDialog(null,"Antecessor:"+antecessor);
} 
}
