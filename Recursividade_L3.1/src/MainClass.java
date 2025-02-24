/**
 *
 * @author Gustavo
 * 1. Crie uma função recursiva que exiba a quantidade de dígitos de um número inteiro passado como
 * parâmetro:
 * O código deve trazer como comentários:
 * A condição de parada
 * Como escrever a função para o termo n em função do termo anterior
 * 
**/
import javax.swing.JOptionPane;
public class MainClass {
    public static void main(String[] args) {
        Function_countDigitos CD = new Function_countDigitos();
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, "O número "+ n + " tem "+CD.contarDigitos(n)+" dígitos.");
    }
}
