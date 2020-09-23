package pedraPapelTesoura;

public class Jogada {
	String resposta = "";
	
	public String opcoesJogadas(int a) {
		switch (a) {
		case 1:
			resposta = "Pedra";
			break;
		case 2:
			resposta = "Papel";
			break;
		case 3:
			resposta = "Tesoura";
			break;
		default:
			resposta = "Opção invalida !!!";
			break;
		}
		return resposta;
	}
	
	
	
}
