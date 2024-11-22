package br.com.unemind.bo;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.unemind.bean.ContaUsuario;
import br.com.unemind.dao.ContaUsuarioDao;

public class ContaUsuarioBo {

	private ContaUsuarioDao contaUsuarioDao;

	
	public ContaUsuarioBo(Connection conexao) {
		contaUsuarioDao = new ContaUsuarioDao(conexao);
	}
	
	public void cadastrar(ContaUsuario usuario) throws SQLException {
		contaUsuarioDao.cadastrar(usuario);
	}
	

}