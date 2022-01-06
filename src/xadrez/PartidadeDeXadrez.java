package xadrez;

import tabuleiro.Tabuleiro;
import pecas.xadrez.Rei;
import pecas.xadrez.Torre;

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
    private void coloqueUmaNovaPeca(char coluna, int linha, PecaDeXadrez peca){
        tabuleiro.colocarPeca(peca, new PosicaoXadrez(linha, coluna).posicionar());
    }

    private void iniciarPartida(){
        coloqueUmaNovaPeca('b',6, new Torre(tabuleiro, Cor.WHITE));
        coloqueUmaNovaPeca('e',8, new Rei(tabuleiro, Cor.BLACK));
        coloqueUmaNovaPeca('e',1, new Rei(tabuleiro, Cor.WHITE));
     }

}
