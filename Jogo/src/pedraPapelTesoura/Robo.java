package pedraPapelTesoura;

import java.util.Random;

public class Robo extends Jogadores {

	int pontuacao = 0;
	int jogada;	
	
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
	public int getPontuacao() {
		return pontuacao;
	}

	

	@Override
	public void somaPontuacao(int a) {
		pontuacao = a + 1;
		setPontuacao(pontuacao);
	}

	@Override
	public int subPontuacao() {
		if(pontuacao == 0 ) {
			return pontuacao;
		}else if(pontuacao >= 1) {
			return pontuacao -= 1;
		}
		return pontuacao;
		
	}

	@Override
	public String toString() {
		return "Robo pontuacao = " + pontuacao;
	}
	
	
	
	public int geradorJogada() {
		Random rd = new Random();		
		int jogada = rd.nextInt(3)+1;
		
		return jogada;
	}
}
