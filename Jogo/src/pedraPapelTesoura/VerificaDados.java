package pedraPapelTesoura;

public class VerificaDados {
	Robo robo = new Robo();
	Jogador1 jogador = new Jogador1();
	
	public Boolean verificaNome(String a) {
		boolean resultadoNome = false;
		if(a.length() > 2) {			
			 resultadoNome = true;
		}else {
			resultadoNome = false;
		}
		return resultadoNome;
	}
	
	
	public Boolean verificaJogada(int a) {
		boolean resultadoJogada = true;
		if(a == 1 || a == 2 || a == 3) {
			resultadoJogada = true;
		}else {
			resultadoJogada = false;
		}
		return resultadoJogada;
	}
	
	
	public String verificaGanhador(int a, int b) {
		
		String resultadoGanhador = "";
		
		if(a == 1 && b == 2 || a == 3 && b == 1 || a == 2 && b == 3) {
			resultadoGanhador = "Robo venceu";
			robo.somaPontuacao(1);
			jogador.subPontuacao();
			return resultadoGanhador;
		}else if(a == 1 && b == 3 || a == 3 && b == 2 || a == 2 && b == 1) {
			resultadoGanhador = "Jogador venceu";
			jogador.somaPontuacao(1);
			robo.subPontuacao();
			return resultadoGanhador;
		}else if(a == 1 && b == 1 || a == 2 && b == 2 || a == 3 && b == 3) {
			resultadoGanhador = "Empate";
			robo.somaPontuacao(1);
			jogador.somaPontuacao(1);
			return resultadoGanhador;
		}
		return resultadoGanhador;
	}
}
