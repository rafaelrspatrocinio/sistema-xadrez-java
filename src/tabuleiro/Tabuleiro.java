package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas<1 || colunas<1){
			throw new TabuleiroException("Erro ao Criar tabuleiro, é preciso que o tabuleiro tenha pelo menos uma linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca (int linha, int coluna){
		if (!posicaoExiste(linha,coluna)){
			throw new TabuleiroException("Está Posição não Existe");
		}
		return pecas[linha][coluna];
	}

	public Peca peca (Posicao posicao){
		if (!posicaoExiste(posicao)){
			throw new TabuleiroException("Está Posição não Existe");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void colocarPeca (Peca peca, Posicao posicao){
		if (haUmaPeca(posicao)){
			throw new TabuleiroException("Já Existe uma Peça Posição " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	public Boolean posicaoExiste(int linha, int coluna){
		return linha >= 0 && linha < linhas && coluna >=0 && coluna < colunas;
	}

	public Boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}

	public Boolean haUmaPeca(Posicao posicao){
		if (!posicaoExiste(posicao)){
			throw new TabuleiroException("Está Posição não Existe");
		}
		return peca(posicao) != null;
	}



}
