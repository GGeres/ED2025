import javax.swing.JOptionPane;

public class MaiorElementoArray {
	public static void main (String args[]) {
		int [] vet = {5, 4 , 14, 30, 18, 22, 65, 78, 103, 440, 81, 1, 410};
		JOptionPane.showMessageDialog(null, "O maior valor no array é: "+FMaiorArray(vet, vet.length));
	}
	
	public static int FMaiorArray(int v[], int tam) {
		if(tam == 1) {
			return v[0];
		} else {
			int MaxRest = FMaiorArray(v, tam - 1);
			return Math.max(MaxRest, v[tam - 1]);
		}
	}
}
