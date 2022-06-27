package br.com.alura.escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneComDDDouNumeroInvalidos() {
		String ddd = "11";
		String numero = "123456789";
		
		Telefone telefone = new Telefone(ddd, numero);
		assertEquals(ddd, telefone.getDdd());
		assertEquals(numero, telefone.getNumero());
	}

}
