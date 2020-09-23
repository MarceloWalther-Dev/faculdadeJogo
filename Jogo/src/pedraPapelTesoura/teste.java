package pedraPapelTesoura;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Jogada jg = new Jogada();
		Robo robo = new Robo();
		Scanner sc = new Scanner(System.in);		
		VerificaDados verificaDados = new VerificaDados();		
		Jogador1 jogador = new Jogador1();
		
		String nome;
		
		//JOGO
		System.out.println("###------Bem vindo ao Jogo------###");
		System.out.println("Coloque o seu nome :");
		
		nome = sc.nextLine();
		
		if(verificaDados.verificaNome(nome) == true) {
		//Se for um nome valido e estancia o usuario	
			jogador.setNome(nome);
			System.out.println(jogador);
			int jogada;
			do {
				
				if(jogador.getPontuacao() == 0 && robo.getPontuacao() == 0) {
					System.out.println("!! Escolha uma das opções abaixo !!");
					System.out.println("1 p/ Pedra");
					System.out.println("2 p/ Papel");
					System.out.println("3 p/ Tesoura");
					System.out.println("0 p/ Sair");
				}
				System.out.println("Escolha a sua jogada");
				jogada = sc.nextInt();
				
				 boolean resultado = verificaDados.verificaJogada(jogada);// Verifica se a jogada é valida
				if(resultado == true) {
					
						System.out.println(jg.opcoesJogadas(jogada)); // interpreta o numero para a string
						
						System.out.println("Aguarde a vez do Robo");
						
						int jogadaRobo = robo.geradorJogada();// numero randomico do robo
						
						System.out.println(jg.opcoesJogadas(jogadaRobo));// converte a jogada do robo para uma string
						
						System.out.println(verificaDados.verificaGanhador(jogada,jogadaRobo)); // verifica as jogadas e compara para descobrir o ganhador
					
				}
			}while (jogada != 0); 
				System.out.println("Pontuação do robo " +robo.getPontuacao());
				System.out.println("Pontuação do Jogador " +jogador.getPontuacao());
				sc.close();
			
			
		}else {
			System.out.println("Desculpe é necessario colocar um nome para continuar jogando");
		}
		
		
		
		
		
		
	
		
		
	}
}
