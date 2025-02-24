package recursividade_l3.pkg7;

/**
 *
 * @author Gustavo
 * Escreva uma função recursiva que calcule a soma dos dígitos de um número inteiro. 
 * Por exemplo, se a entrada for 123, portanto 1+2+3, logo, a saída deverá ser 6.
 */
import javax.swing.JOptionPane;
public class Recursividade_L37 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, "A soma dos dígitos de "+num+" é "+digitSum(num));
    }
    
    public static int digitSum(int x){
        if(x == 0){
            return 0;
        } else{
            return(x % 10) + digitSum(x / 10);
        }
    }
    
    
}
