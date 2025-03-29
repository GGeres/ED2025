import javax.swing.JOptionPane;

public class InversãoStr {
	public static void main (String args[]) {
		String word;
		word = JOptionPane.showInputDialog("Digite uma palavra:");
		JOptionPane.showMessageDialog(null, word +"\n"+ FInver(word));
	}
	
	public static String FInver(String drow) {
		if(drow.isEmpty()) {
			return drow;
		} 
		return FInver(drow.substring(1)) + drow.charAt(0);
	}
}
