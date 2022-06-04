package view;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import controller.AtendenteController;
import model.Atendente;

public class PrincipalAtendente {

	public static void main(String[] args) {
		AtendenteController atCont = new AtendenteController();

		Atendente at = new Atendente();
		at.setId(1);
		at.setNome("Henrique Neves");
		at.setEmail("henrique@email.com");
		at.setDataNascimento(LocalDate.of(1994, 8, 2));
		at.setHorarioEntrada(8);
		at.setHorarioSaida(17);
		at.setSalario(1800.00f);
		
		try {
			salvarAtendente(atCont, at);
//			modificarAtendente(atCont, at);
//			removerAtendente(atCont, at);
//			listarAtendente(atCont);
//			insereMuitosAtendentes(atCont);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void salvarAtendente(AtendenteController atCont, Atendente at) throws SQLException {
		atCont.salvar(at);

//		Atendente at1 = new Atendente();
//		at1.setId(1);
//
//		at1 = atCont.consultar(at1);
//		System.out.println(at1);
	}

	private static void listarAtendente(AtendenteController atCont)  throws SQLException {
		insereMuitosAtendentes(atCont);
		List<Atendente> atendentes = atCont.listar();
		atendentes.forEach(at -> System.out.println(at));
		
	}

	private static void insereMuitosAtendentes(AtendenteController atCont) throws SQLException {
//		Atendente at = new Atendente();
//		at.setId(1);
//		at.setNome("Petr Cech");
//		at.setEmail("petr@empreesa.com");
//		at.setDataNascimento(LocalDate.of(1982, 9, 22));
//		at.setHorarioEntrada(8);
//		at.setHorarioSaida(17);
//		at.setSalario(6000.00f);
		
		Atendente at1 = new Atendente();
		at1.setId(1);
		at1.setNome("Henrique Neves");
		at1.setEmail("henrique@email.com");
		at1.setDataNascimento(LocalDate.of(1994, 8, 2));
		at1.setHorarioEntrada(8);
		at1.setHorarioSaida(17);
		at1.setSalario(1800.00f);
		
		Atendente at2 = new Atendente();
		at2.setId(2);
		at2.setNome("Juliana Rodrigues");
		at2.setEmail("juliana@email.com");
		at2.setDataNascimento(LocalDate.of(1995, 3, 31));
		at2.setHorarioEntrada(8);
		at2.setHorarioSaida(18);
		at2.setSalario(1500.00f);
		
//		atCont.salvar(at);
		atCont.salvar(at1);
		atCont.salvar(at2);
		
	}

	private static void removerAtendente(AtendenteController atCont, Atendente at) throws SQLException {
		Atendente at1 = at;

		atCont.remover(at1);
		at1 = atCont.consultar(at1);
		System.out.println(at1);
	}
	
	private static void modificarAtendente(AtendenteController atCont, Atendente at) throws SQLException {
		Atendente at1 = at;
		at1.setHorarioEntrada(10);
		at1.setHorarioSaida(19);

		atCont.modificar(at1);
		at1 = atCont.consultar(at1);
		System.out.println(at1);
	}
}
