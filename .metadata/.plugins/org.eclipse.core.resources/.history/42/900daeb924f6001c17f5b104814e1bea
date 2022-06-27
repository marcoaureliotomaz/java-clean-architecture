package br.com.alura.escola.aluno;

public class Email {
	
	public Email(String endereco) {
		if (endereco == null || !endereco.matches("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})$")) {
			throw new IllegalArgumentException("Email inválido!");
		}
		
		this.endereco = endereco;
	}

	private String endereco;

	public String getendereco() {
		return endereco;
	}

	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	

}
