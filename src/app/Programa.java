package app;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.PartidadeDeXadrez;

public class Programa {

	public static void main(String[] args) {

		PartidadeDeXadrez partidadeDeXadrez = new PartidadeDeXadrez();

		UI.printTabuleiro(partidadeDeXadrez.getPecas());


		
	}

}
