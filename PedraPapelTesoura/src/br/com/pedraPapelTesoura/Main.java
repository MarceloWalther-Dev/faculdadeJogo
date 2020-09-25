package br.com.pedraPapelTesoura;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome;
		int jogada;
		boolean resultado;
		
		Scanner sc = new Scanner(System.in);
		Validacoes valida = new Validacoes();
		VerificaJogada jogadas = new VerificaJogada();
		
		
		System.out.println("!!!_____SEJA BEM VINDO AO JOGO_____!!!");
		System.out.println("");
		System.out.println("Coloque o seu nome ");
		nome = sc.nextLine();
		System.out.println("");
		if(valida.validaNome(nome) == true) {
			
			Jogador jogador	= new Jogador(nome, 0);		
			Robo robo = new Robo("Robo", 0); // Verificamos o nome e criamos um jogador com pontuacao 0 e geramos o robo automaticamente 
			
			System.out.println(jogador);
			System.out.println(robo);
			System.out.println("");
			System.out.println("----- BORA JOGAR -----");
			System.out.println("");
			do {
				
				if(jogador.getPontuacao() == 0 && robo.getPontuacao() == 0) {
					System.out.println("!! Escolha uma das opções abaixo !!"); // opçoes do jogo
					System.out.println("1 p/ Pedra");
					System.out.println("2 p/ Papel");
					System.out.println("3 p/ Tesoura");
					System.out.println("0 p/ Sair");
				}
				System.out.println("");
				System.out.println("Escolha a sua jogada");
				System.out.println("");
				jogada = sc.nextInt();				
				resultado = valida.validaJogada(jogada);
				
				if(resultado) {
					
				int jogadaRobo = robo.geradorJogada();
				System.out.println(jogadas.verificaGanhador(jogada, jogadaRobo));
					if(jogadas.verificaGanhador(jogada, jogadaRobo) == "Jogador venceu !!") {
						jogador.somaPontuacao();
					}else if(jogadas.verificaGanhador(jogada, jogadaRobo) == "Robo venceu :-(") {
						robo.somaPontuacao();
					}else if(jogadas.verificaGanhador(jogada, jogadaRobo) == "Empate") {
						jogador.somaPontuacao();
						robo.somaPontuacao();
					}
				}else {
					System.out.println("Jogada invalida");
					jogada = 0;
				}
				
			}while (jogada != 0); 
				System.out.println("");
				System.out.println("PONTUAÇÃO DA PARTIDA");
				System.out.println("");
				System.out.println(robo);
				System.out.println(jogador);
				sc.close();
			
			
		}else {
			System.out.println("Nome invalido, por favor verificar");
		}
	}

}
