package br.com.alura.escola.dominio.aluno;

public class Cpf {
	
	public Cpf(String cpf) {
		if (cpf == null || !cpf.matches("([0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2})")){
			throw new IllegalArgumentException("CPF Inválido!");
		}
		this.cpf = cpf;
	}
	
	private String cpf; 
	

	public String getCpf() {
		return cpf;
	} 



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



}
