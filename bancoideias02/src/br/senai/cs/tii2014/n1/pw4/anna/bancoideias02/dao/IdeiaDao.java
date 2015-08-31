package br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.dao;

import java.sql.PreparedStatement;

import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.entity.Ideia;

public class IdeiaDao extends Dao {
	
	public void Salvar (Ideia ideia){
		String sql = "INSERT INTO ideia(titulo, descricao) VALUES(?, ?)";
		
		try { PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
		preparedStatement.setString(1, ideia.getTitulo());
		preparedStatement.setString(2, ideia.getDescricao());
		
		if(preparedStatement.executeUpdate() < 1){
			throw new Exception("Erro ao inserir");
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
