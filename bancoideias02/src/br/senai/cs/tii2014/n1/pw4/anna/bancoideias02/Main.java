package br.senai.cs.tii2014.n1.pw4.anna.bancoideias02;

import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.IdeiaRN;
import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.UserRN;
import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.entity.Ideia;
import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.entity.User;

public class Main {

	public static void main(String[] args) {
		salvarUser();
		salvarIdeia();
	}

	private static void salvarUser() {
		User user = new User();
		user.setEmail("ana@mail.com");
		user.setNome("Ana Brega da Silva");
		
		UserRN rn = new UserRN();
		
		try {
			rn.salvar(user);
			System.out.println("User salvo.");
		} catch (Exception e) {
			System.out.println("Erro ao salvar user.");
			e.printStackTrace();
		}
		
	}
	
	private static void salvarIdeia(){
		Ideia ideia = new Ideia();
		ideia.setTitulo("Dominação do Mundo");
		ideia.setDescricao("Dominar o mundo colocando gatos em todas as casas");
		
		IdeiaRN rn = new IdeiaRN();
		
		try {
			rn.Salvar(ideia);
			System.out.println("Ideia salva.");
		} catch (Exception e) {
			System.out.println("Erro ao salvar ideia.");
			e.printStackTrace();
		}
		
		
	}

}
