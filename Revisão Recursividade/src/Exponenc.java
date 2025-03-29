import javax.swing.JOptionPane;

public class Exponenc {
	public static void main (String args []) {
		int num, exp;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do expoente:"));
		JOptionPane.showMessageDialog(null,"O resultado é "+FExp(num, exp));
	}
	
	public static int FExp(int n, int exp) {
		if(exp == 0) {
			return 1;
		} else {
			return n * FExp(n, exp - 1);
		}
	}
}
