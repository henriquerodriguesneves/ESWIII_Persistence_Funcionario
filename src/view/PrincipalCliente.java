package view;

import java.sql.SQLException;
import java.util.List;

import controller.ClienteController;
import model.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		ClienteController cCont = new ClienteController();

		Cliente cli = new Cliente();
		cli.setCpf("12345678900");
		cli.setNome("Fulano de Tal");
		cli.setCelular("11922222222");
		cli.setEmail("fulano@email.com");
		cli.setPronomeTratamento("Sr.");

		try {
			insereMuitosCliente(cCont);
//			salvarCliente(cCont, cli);
//			modificarCliente(cCont, cli);
//			removerCliente(cCont, cli);
//			listarCliente(cCont);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void listarCliente(ClienteController cCont)  throws SQLException {
		insereMuitosCliente(cCont);
		List<Cliente> clientes = cCont.listar();
		clientes.forEach(cli -> System.out.println(cli));
		
	}

	private static void insereMuitosCliente(ClienteController cCont) throws SQLException {
		Cliente cli = new Cliente();
		cli.setCpf("23837473687");
		cli.setNome("Joao Silva");
		cli.setCelular("11928372837");
		cli.setEmail("joao@email.com");
		cli.setPronomeTratamento("Sr.");
		
		Cliente cli1 = new Cliente();
		cli1.setCpf("90856483799");
		cli1.setNome("Maria Silva");
		cli1.setCelular("1232439876");
		cli1.setEmail("maria@email.com");
		cli1.setPronomeTratamento("Sra.");
		
		Cliente cli2 = new Cliente();
		cli2.setCpf("89757437456");
		cli2.setNome("Maria das Dores");
		cli2.setCelular("11938472634");
		cli2.setEmail("madores@email.com");
		cli2.setPronomeTratamento("Srta.");
		
		cCont.salvar(cli);
		cCont.salvar(cli1);
		cCont.salvar(cli2);
		
	}

	private static void removerCliente(ClienteController cCont, Cliente cli) throws SQLException {
		Cliente cli1 = cli;
		cli1.setCelular("11922222223");

		cCont.remover(cli1);
		cli1 = cCont.consultar(cli1);
		System.out.println(cli1);
	}
	
	private static void modificarCliente(ClienteController cCont, Cliente cli) throws SQLException {
		Cliente cli1 = cli;
		cli1.setCelular("11922222223");

		cCont.modificar(cli1);
		cli1 = cCont.consultar(cli1);
		System.out.println(cli1);
	}

	private static void salvarCliente(ClienteController cCont, Cliente cli) throws SQLException {
		cCont.salvar(cli);

		Cliente cli1 = new Cliente();
		cli1.setCpf("12345678900");

		cli1 = cCont.consultar(cli1);
		System.out.println(cli1);
	}

}
