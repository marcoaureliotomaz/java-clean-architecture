package escola;

public class Telefone {
	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if (ddd == null || numero == null) {
			throw new IllegalArgumentException("DDD e N?mero s?o obrigat?rios");	
		}
		
		if (!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD inv?lido");
		}
		
		if (!numero.matches("\\d{8} | \\d{9}")) {
			throw new IllegalArgumentException("N?mero inv?lido");
		}
				
		this.setDdd(ddd);
		this.setNumero(numero);
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
