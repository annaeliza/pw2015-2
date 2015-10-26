package br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.mb;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.UserRN;
import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.entity.User;

@ManagedBean
public class UserMB {
	
	private List<User> users;
	private User user;
	private UserRN rn;
	
	@PostConstruct
	public void init(){
		rn = new UserRN();
		user = new User();
	}

	public List<User> getUsers() {
		if(users == null){
			users = rn.listar();
 		}
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String salvar(){
		try {
			rn.salvar(user);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return "userlist";
	}
	
	public String excluir(String idParam){
		Long id = Long.parseLong(idParam);
		try {
			rn.excluir(id);
			users = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String editar(String idParam){
		Long id = Long.parseLong(idParam);
		user = rn.buscarPorId(id);
		return "userform";
	}
	
}
