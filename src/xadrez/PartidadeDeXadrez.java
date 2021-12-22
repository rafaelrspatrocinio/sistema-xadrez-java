package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidadeDeXadrez {

    private Tabuleiro tabuleiro;

    public PartidadeDeXadrez(){
        tabuleiro = new Tabuleiro(8, 8);
        iniciarPartida();
    }

    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez[][] mat = new  PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];

        for (int i=0; i<tabuleiro.getLinhas(); i++){
            for (int j=0; j< tabuleiro.getColunas(); j++){
                mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i,j);
            }
        }
        return mat;
    }

    private void iniciarPartida(){
        tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.WHITE), new Posicao(2,1));
        tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BLACK), new Posicao(0,4));
        tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.WHITE), new Posicao(7,4));
    }

}
