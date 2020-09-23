package pedraPapelTesoura;

public class Jogador1 extends Jogadores {
	
	String nome;
	int pontuacao = 0;
	
	
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	
	public void setNome(String a) {
		this.nome = a;
	}

	public String getNome() {
		return nome;
	}




	public void somaPontuacao(int a) {
		pontuacao = a +1;
		setPontuacao(pontuacao);
		
	}
	
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
		return "Jogador1 Nome = " + nome + ", pontuacao = " + pontuacao;
	}
	
	
	
}
