package br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model;

import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.dao.UserDao;
import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.entity.User;

public class UserRN {
	
	private UserDao dao;
	
	public UserRN(){
		dao = new UserDao();
	}
	
	public void salvar(User user) throws Exception{
		if (user.getNome().length() < 10){
			throw new Exception("Nome Incompleto");
		}
		
		if(!user.getNome().contains(" ")){
			throw new Exception("Nome incompleto. Por favor preencha o sobrenome.");
		}
		
		try {
			dao.salvar(user);
			System.out.println("Salvou.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Erro ao inserir.");
		}
	}
	

}
