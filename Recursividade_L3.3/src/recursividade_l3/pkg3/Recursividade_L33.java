package recursividade_l3.pkg3;

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
public class Recursividade_L33 {

    public static void main(String[] args) {
        String entrada;
        entrada = JOptionPane.showInputDialog("Digite uma palavra");
        JOptionPane.showMessageDialog(null, "String invertida: "+ invertString(entrada));
    }
    
    public static String invertString(String enter){
        if(enter.isEmpty() || enter.length() == 1){
            return enter;
        } else{
            return  enter.substring(enter.length() - 1) + invertString(enter.substring(0, enter.length() - 1));
        }
    }
    
}
