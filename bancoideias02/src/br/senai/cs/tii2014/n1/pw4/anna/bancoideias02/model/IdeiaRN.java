package br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model;

import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.dao.IdeiaDao;
import br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.model.entity.Ideia;

public class IdeiaRN {
	
	private IdeiaDao dao;
	
	public IdeiaRN(){
		dao = new IdeiaDao();
	}
	
	public void Salvar(Ideia ideia) throws Exception{
		if (ideia.getTitulo().length() > 25){
			throw new Exception("Título muito extenso.");
		}
		
		if (ideia.getDescricao().length() > 50){
			throw new Exception("Ideia muito extensa.");
		}
		
		try {
			dao.Salvar(ideia);
			System.out.println("Salvou.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao inserir.");
		
		}
		
	}

}
