package br.com.unemind.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.unemind.bean.ContaUsuario;


public class ContaUsuarioDao {
	
	private Connection conexao;
	

	public ContaUsuarioDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	
	public void cadastrar(ContaUsuario usuario) throws SQLException {
		
		PreparedStatement stmt = conexao.prepareStatement("insert into t_scg_conta_usuario(cd_usuario, nm_usuario, "
				+ "ds_email, ds_senha, ds_genero, dt_nascimento, ds_interesse_1, ds_interesse_2, ds_grau_humor_1, "
				+ "ds_grau_ansiedade_1, nm_faculdade, nm_curso) values (sq_t_scg_conta_usuario.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
		
		Date data = Date.valueOf(usuario.getData().toString());
		
		//stmt.setInt(1, usuario.getCodigoUsuario());
		stmt.setString(1, usuario.getNomeCompleto());
		stmt.setString(2, usuario.getEmail()); 
		stmt.setString(3, usuario.getSenha());
		stmt.setString(4, usuario.getGenero());
		stmt.setDate(5, data);
		stmt.setString(6, usuario.getInteresse1());
		stmt.setString(7, usuario.getInteresse2());
		stmt.setString(8, usuario.getGrauHumor1());
		stmt.setString(9, usuario.getGrauAnsiedade1());
		stmt.setString(10, usuario.getFaculdade());
		stmt.setString(11, usuario.getCurso());
		
		//aceitar termos & condições de coleta de dados

		stmt.executeUpdate();
		
		
		stmt.close(); 
		
	}

}