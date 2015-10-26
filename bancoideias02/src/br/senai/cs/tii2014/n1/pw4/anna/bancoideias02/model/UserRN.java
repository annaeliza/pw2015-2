package br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model;

import java.util.List;
import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.dao.UserDao;
import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.entity.User;


public class UserRN {
	
	private UserDao dao;
	
	public UserRN() {
		dao = new UserDao();
	}

	public void salvar(User user) throws Exception {
		if (user.getNome().trim().isEmpty()) {
			throw new Exception("O nome é obrigatório!");
		}

		if (user.getEmail().trim().isEmpty()) {
			throw new Exception("O E-mail é obrigatório!");
		}
		
		dao.salvar(user);
	}

	public List<User> listar() {
		return dao.listarTodos();
	}

	public User buscarPorId(Long id) {
		return dao.buscarPorId(id);
	}

	public void excluir(Long id) throws Exception {
		dao.excluir(id);
	}

}
