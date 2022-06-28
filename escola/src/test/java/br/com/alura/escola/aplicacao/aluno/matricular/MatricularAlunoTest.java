package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.dominio.aluno.RepositorioDeAluno;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test	
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria(); 
		MatricularAluno usecase = new MatricularAluno(repositorio);
		
		MatricularAlunoDTO dados = new MatricularAlunoDTO("Fulano","321.654.987-78","null@null.com");
		
		usecase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(new Cpf("321.654.987-78"));
		
		assertEquals("Fulano",encontrado.getNome());
		assertEquals("321.654.987-78",encontrado.getCpf());
		assertEquals("null@null.com",encontrado.getEmail());
		
	}

}
