import java.util.List;

import Entidade.Cliente;
import Entidade.Produto;
import Persistencia.jdbc.ClienteDAO;
import Persistencia.jdbc.ProdutoDAO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cliente cliente = new Cliente(2, "123.456.667-09", "Joana Silveira", "001.456.098-99", "femminino");
		Produto produto = new Produto(1, "vaso bege", "vaso plástico", (float) 15.00, 5);
		
		//ClienteDAO cliDAO = new ClienteDAO();
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		//Cliente cli = cliDAO.buscarPorCod(3);
		//Produto prod = produtoDAO.insert(produto);
		
		//System.out.println(cli.toString());
		
		//List<Cliente> lista = cliDAO.buscarTodos();
		
		//for (Cliente cliente2 : lista) {
			//System.out.println(cliente2.toString());
		//}
	}

}