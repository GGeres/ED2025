package view;
import br.edu.fateczl.fila.*;
import controller.OperacaoController;
import model.Cliente;

public class Principal {
	public static void main(String args[]) throws Exception {
				
		Fila<Cliente> f = new Fila<>();
		for(int i = 1; i <= 20; i++) {
			String nome = "Cliente" + i;
			int QtdPecas = (int) (Math.random()*31) + 20;
			float ValorPecas = (float) ((Math.random() * 95) + 5.00);
			Cliente c = new Cliente(nome, QtdPecas, ValorPecas);
			f.insert(c);
		}
		OperacaoController.operar(f);
	}
}
