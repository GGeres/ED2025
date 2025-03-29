import javax.swing.JOptionPane;
public class Soma_Digitos {
	public static void main (String args []) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		JOptionPane.showMessageDialog(null, "A soma dos dígitos de "+num+" é igual a "+FSomaDig(num));
	}
	
	public static int FSomaDig(int n) {
		if(n < 10) {
			return n; // Se n for um número menor que 10, ele não tem com quem somar
		} else {
			return(n % 10) + FSomaDig(n/10); //Divide o numero por 10 e o resto soma com o próximo número
		}
	}
}
