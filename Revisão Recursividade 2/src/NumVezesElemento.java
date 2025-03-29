import javax.swing.JOptionPane;

public class NumVezesElemento {
	public static void main (String args[]) {
		int [] vet = {5, 6, 9, 5, 2, 8, 8, 4, 6, 2, 9, 8, 8, 5};
		int Element = Integer.parseInt(JOptionPane.showInputDialog("Qual número do vetor contar?"));
		JOptionPane.showMessageDialog(null, "O número "+Element+" aparece "+FContNum(vet, 0, Element)+" vezes.");
	}
	
	public static int FContNum(int array[], int tam, int num) { // Array, Array.Length, Número que vai contar
		if(tam == array.length) {
			return 0;
		}
		if(array[tam] == num){
			return 1 + FContNum(array, tam + 1, num);			
		} else {
			return FContNum(array, tam + 1, num);
		}
	}
}
