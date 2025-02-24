package recursividade_l3.pkg2;

/**
 *
 * @author Gustavo
 * 2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 10 
 * a 999999 e recebendo um 2o número inteiro (de 0 a 9), tenha uma função recursiva que apresente quantas 
 * vezes o 2o número aparece no primeiro.
 * 
 */
import javax.swing.JOptionPane;
public class Recursividade_L32 {
    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        if(x >= 10 || x < 1000000){
            if(y >= 0 || x < 10){
                JOptionPane.showMessageDialog(null, "1º Número = "+x+"\n2º Número = "+y+"\nAparece "+contarVezes(x,y)+" vezes");
            } else{
                JOptionPane.showMessageDialog(null, "Número fora do padrão exigido!!");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Número fora do padrão exigido!!");
        }
        
    }
    
   public static int contarVezes(int a, int b){
       
       if(a == 0){
           // Relação de Parada pois sendo a, o primeiro número igual a 0, todos os dígitos já foram avaliados
           return 0;
       } else{
           // Relação de Chamada de Passos: A cada chamada, o último dígito é analisado e o número diminui uma casa decimal 
           int lastDigit = a % 10;
           int cont = (lastDigit == b) ? 1 : 0;
           return cont + contarVezes(a / 10, b);
       }
       
       
   }
    
}
