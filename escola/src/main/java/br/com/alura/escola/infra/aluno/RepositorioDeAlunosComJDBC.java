package br.com.alura.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.dominio.aluno.RepositorioDeAluno;
import br.com.alura.escola.dominio.aluno.Telefone;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAluno {

	final private Connection connection;
	
	public RepositorioDeAlunosComJDBC(Connection connection) {
		this.connection = connection;
	}
	
	
	@Override
	public void matricular(Aluno aluno) {
		String sql = "INSERT INTO ALUNO VALUES (?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, aluno.getCpf());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.execute();
			
			sql = "INSERT INTO TELEFONES VALUES (?,?)";
			ps = connection.prepareStatement(sql);
			
			for (Telefone telefone : aluno.getTelefones() ) {
				ps.setString(1, telefone.getDdd());
				ps.setString(2, telefone.getNumero());
				ps.execute();
				
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public Aluno buscarPorCPF(Cpf cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}