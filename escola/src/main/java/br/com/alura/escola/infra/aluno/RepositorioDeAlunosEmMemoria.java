package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.dominio.aluno.RepositorioDeAluno;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAluno {
	
	private List<Aluno> matriculados = new ArrayList<>();

	@Override
	public void matricular(Aluno aluno) {
		// TODO Auto-generated method stub
		this.matriculados.add(aluno);

	}

	@Override
	public Aluno buscarPorCPF(Cpf cpf) {
		// TODO Auto-generated method stub
		return this.matriculados.stream()
				.filter(a -> a.getCpf().equals(cpf.getCpf()))
				.findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return this.matriculados;
	}

}
