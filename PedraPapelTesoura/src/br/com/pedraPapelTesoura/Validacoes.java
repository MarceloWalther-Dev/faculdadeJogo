package br.com.pedraPapelTesoura;

public class Validacoes {
	
	boolean resposta;
	String alerta;
	
	public boolean validaNome(String a) {
		if(a.length() >= 2) {
			resposta = true;
			return resposta;
		}else {
			resposta = false;
			return resposta;
		}			
	}
	
	public boolean validaJogada(int a) {
		if(a == 0 || a == 1 || a == 2 || a == 3) {
			resposta = true;
			return resposta;
		}else {
			resposta = false;
			return resposta;
		}
	}

}
