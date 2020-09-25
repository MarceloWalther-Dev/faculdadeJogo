package br.com.pedraPapelTesoura;

public class Jogador extends User implements Pontuacao{	
	
	

	public Jogador(String nome, int pontuacao) {
		super(nome, pontuacao);
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return  getNome() + ", pontuacao = " + getPontuacao();
	}

	
	
	
	
	

}
