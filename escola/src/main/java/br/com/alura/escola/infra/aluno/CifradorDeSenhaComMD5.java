package br.com.alura.escola.infra.aluno;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.alura.escola.dominio.aluno.CifradorDeSenha;

public class CifradorDeSenhaComMD5 implements CifradorDeSenha {

	@Override
	public String cifrarSenha(String senha) {
		// TODO Auto-generated method stub
		try {
			MessageDigest md  = MessageDigest.getInstance("MD5");
			md.update(senha.getBytes());
			byte[] bytes = md.digest();
			StringBuilder sb  = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100,16 ).substring(1));
			}
			return sb.toString();
		}
		catch (NoSuchAlgorithmException e){
			throw new RuntimeException("Erro ao gerar hash da senha");
		}
	}

	@Override
	public boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta) {
		
		return senhaCifrada.equals(cifrarSenha(senhaAberta));
	}

}
