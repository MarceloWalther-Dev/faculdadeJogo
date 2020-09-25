package br.com.pedraPapelTesoura;

public abstract class User {
	
	private String nome;
	private int pontuacao;
	

	public User(String nome, int pontuacao) {
		this.nome = nome;
		this.pontuacao = pontuacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	

}
