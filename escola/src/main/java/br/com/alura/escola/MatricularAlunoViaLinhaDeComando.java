package br.com.alura.escola;

import java.util.List;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.dominio.aluno.RepositorioDeAluno;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {

	public static void main(String[] args) {
		
		String nome = "Marco Aurélio Tomaz";
		String cpf = "12345678900";
		String email = "marco.@marco.com.br";
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria() );
	    matricular.executa(new MatricularAlunoDTO(nome, cpf, email));	

		}
	}
	

