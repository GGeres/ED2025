import javax.swing.JOptionPane;
public class Fatorial {
	public static void main(String []args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
		JOptionPane.showMessageDialog(null, "O fatorial de "+num+" é "+FFat(num));
	}
	
	public static int FFat(int n) {
		int fat;
		if(n > 1) {
			fat = n * FFat(n-1);
			return fat;
		}else {
			return n;
		}
	}
}
