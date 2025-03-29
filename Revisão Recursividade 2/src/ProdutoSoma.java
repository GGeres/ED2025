import javax.swing.JOptionPane;

public class ProdutoSoma {
	public static void main (String args[]) {
		int x, y, z;
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
		z = y;
		JOptionPane.showMessageDialog(null, "Multiplicação: "+FMultiSoma(x,y,z));
	}
	
	public static int FMultiSoma(int a, int b, int c) {
		if(c == 0) {
			return 0;
		} else {
			return a + FMultiSoma(a, b, c-1);
		}
	}
}
