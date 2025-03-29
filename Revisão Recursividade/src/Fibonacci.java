import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main (String args []) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		JOptionPane.showMessageDialog(null, "O "+num+"º termo da sequência de Fibonacci é "+FFibo(num));
	}
	
	public static int FFibo(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return FFibo(n - 1) + FFibo(n - 2);
	}
}
