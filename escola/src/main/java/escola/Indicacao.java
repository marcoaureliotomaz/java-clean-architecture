package escola;

import java.time.LocalDateTime;

public class Indicacao {
	
	private Aluno indicado;
	public Aluno getIndicado() {
		return indicado;
	}

	public void setIndicado(Aluno indicado) {
		this.indicado = indicado;
	}

	public Aluno getIndicante() {
		return indicante;
	}

	public void setIndicante(Aluno indicante) {
		this.indicante = indicante;
	}

	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}

	public void setDataIndicacao(LocalDateTime dataIndicacao) {
		this.dataIndicacao = dataIndicacao;
	}

	private Aluno indicante;
	private LocalDateTime dataIndicacao;
	
	public Indicacao (Aluno indicado, Aluno indicante) {
		this.indicado = indicado;
		this.indicante = indicante;
		this.dataIndicacao = LocalDateTime.now();
	}
	

}
