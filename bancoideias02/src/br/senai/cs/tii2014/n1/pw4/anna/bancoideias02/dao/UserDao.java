package br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.entity.User;

public class UserDao extends Dao{
	
	public void salvar (User user)throws Exception{
		String INSERT = "INSERT INTO user(nome, email) values(?, ?)";
		
		try {
			PreparedStatement preparedStatement = getConnection().prepareStatement(INSERT);
			preparedStatement.setString(1, user.getNome());
			preparedStatement.setString(2, user.getEmail());
			
			if (preparedStatement.executeUpdate() < 1){
				throw new Exception("Erro ao inserir.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editar (User user){
		String UPDATE = "UPDATE user set nome=?, email=? WHERE id=?";
		
		try {
			PreparedStatement preparedStatement = getConnection().prepareStatement(UPDATE);
			preparedStatement.setString(1, user.getNome());
			preparedStatement.setString(2, user.getEmail());
			
			if (preparedStatement.executeUpdate() < 1){
				throw new Exception("Erro ao editar");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void excluir (User user) throws Exception{
		String DELETE = "DELETE FROM user WHERE id=?";
		
		try {
			PreparedStatement preparedStatement = getConnection().prepareStatement(DELETE);
			preparedStatement.setLong(1, user.getId());
			
			if (preparedStatement.executeUpdate() < 1){
				throw new Exception("Erro ao deletar.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
