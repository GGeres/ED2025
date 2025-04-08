package controller;
import br.edu.fateczl.fila.*;
import model.Cliente;

public class OperacaoController {
	public static void operar(Fila<Cliente> f) throws Exception {
		while(!f.isEmpty()) {
			Cliente c = f.remove();
			float totCompra = c.calcValorTot();
			System.out.println("Cliente: " +c.getNome() + " - Total da Compra: R$ "+ String.format("%.2f", totCompra));
		}
	}
}
