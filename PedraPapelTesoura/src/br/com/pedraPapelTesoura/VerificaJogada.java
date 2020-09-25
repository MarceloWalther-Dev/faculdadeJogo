package br.com.pedraPapelTesoura;


public class VerificaJogada {
	
	private String pedra = "Pedra";
	private String papel = "Papel";
	private String tesoura = "Tesoura";
	private String resposta;
	
	
	public String getPedra() {
		return pedra;
	}


	public void setPedra(String pedra) {
		this.pedra = pedra;
	}


	public String getPapel() {
		return papel;
	}


	public void setPapel(String papel) {
		this.papel = papel;
	}


	public String getTesoura() {
		return tesoura;
	}


	public void setTesoura(String tesoura) {
		this.tesoura = tesoura;
	}


	public String jogada(int a) {
		switch (a) {
		case 1:
			resposta = getPedra();
			break;
		case 2:
			resposta = getPapel();
			break;
		case 3:
			resposta = getTesoura();
			break;
		default:
			resposta = "Por favor verifique a sua jogada";
			break;
		}
		return resposta;
	}
	
	
	public String verificaGanhador(int a, int b) {
		
		String resultadoGanhador = "";
		
		if(a == 1 && b == 2 || a == 3 && b == 1 || a == 2 && b == 3) {
			resultadoGanhador = "Robo venceu :-(";
			return resultadoGanhador;
		}else if(a == 1 && b == 3 || a == 3 && b == 2 || a == 2 && b == 1) {
			resultadoGanhador = "Jogador venceu !!";
			return resultadoGanhador;
		}else if(a == 1 && b == 1 || a == 2 && b == 2 || a == 3 && b == 3) {
			resultadoGanhador = "Empate";
			return resultadoGanhador;
		}
		return resultadoGanhador;
	}

}
