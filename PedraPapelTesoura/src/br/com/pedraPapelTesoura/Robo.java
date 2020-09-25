package br.com.pedraPapelTesoura;

import java.util.Random;

public class Robo extends User implements Pontuacao {	
	
	

	public Robo(String nome, int pontuacao) {
		super(nome, pontuacao);
	}

	@Override
	public int somaPontuacao() {
		setPontuacao(getPontuacao() + 1);
		return getPontuacao();
	}

	@Override
	public int subPontuacao() {
		setPontuacao(getPontuacao() - 1);
		return getPontuacao();
	}
	
	public int geradorJogada() {
		Random rd = new Random();		
		int jogada = rd.nextInt(3)+1;		
		return jogada;
	}

	@Override
	public String toString() {
		return "Robo , pontuacao = " + getPontuacao();
	}	
	

}
