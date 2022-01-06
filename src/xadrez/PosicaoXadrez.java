package xadrez;

import tabuleiro.Posicao;

public class PosicaoXadrez {

    private int linha;
    private char coluna;

    public PosicaoXadrez(int linha, char coluna) {
        if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8){
            throw new XadrezException("Valores acima do esperado");
        }
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public char getColuna() {
        return coluna;
    }

    protected Posicao posicionar(){
        return new Posicao(8 - linha, coluna - 'a');
    }

    protected PosicaoXadrez daPosicao(Posicao posicao){
        return new PosicaoXadrez(8 - posicao.getLinha(), (char)('a' - posicao.getColuna()));
    }

    @Override
    public String toString(){
        return "" + coluna + linha;
    }
}
