package view;

import javax.swing.JOptionPane;

public class Principal {
	public void main(String [] args) {
		int num;
		for(int i = 0; i != 1; i++ ) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
			if(num < 1 || num > 10) {
				JOptionPane.showMessageDialog(null, "Valor inválido.");
				i--;
			} else {
				JOptionPane.showMessageDialog(null, "O fatorial de "+num+" é "+FatController(num));
			}
		}
		
	}
}
