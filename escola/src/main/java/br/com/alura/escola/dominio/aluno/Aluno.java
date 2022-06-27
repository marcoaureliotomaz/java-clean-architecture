package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.indicacao.Indicacao;

public class Aluno {
		
	private Cpf cpf;
	private String nome;
	
	private Email email;
	
	private List<Telefone> telefones = new ArrayList<>();
	
	private String senha;
	
	private Indicacao indicacao; 
	
	public Aluno(Cpf cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
		
	}
	
	public static void main(String[] args) {
		
		FabricaDeAluno fabrica = new FabricaDeAluno();
		Aluno aluno2 = fabrica.comNomeCPFEmail("Marco Aurelio Tomaz","00801618479","marcoaureliotomaz@gmail.com")
		.comTelefone("84","996159775")
		.comTelefone("84","996159776")
		.criar();
		

	}

	public String getCpf() {
		return cpf.getCpf();
	}

	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email.getendereco();
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}
	
}
