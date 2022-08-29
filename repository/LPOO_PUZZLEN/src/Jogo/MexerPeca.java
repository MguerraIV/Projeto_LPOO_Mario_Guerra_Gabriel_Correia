package Jogo;

public class MexerPeca extends Tabuleiro{
	
	private String vazio;
	private String numero;
	private String[][] matrizPecas;
	private int linha;
	private int coluna;
	
	
	public MexerPeca(int matriz) {
		super(matriz);
	}
	
	
	public void achaVazio() { //método para achar o espaço vazio e usá-lo na movimentação
		this.matrizPecas = super.getTabuleiro();
		int linha = 0;
		int coluna = 0;
		for(int i = 0; i != this.matrizPecas.length; i++) {
			for(int k = 0; k != this.matrizPecas.length; k++) {
				if(this.matrizPecas[i][k] == "[ ]") {
					linha = i;
					coluna = k;
				}
			}
		}
		this.linha = linha;
		this.coluna = coluna;
	}
	
	
	public void mexeDireita() {
		achaVazio();
		
		if(coluna != 0) {
			this.vazio = this.matrizPecas[linha][coluna];
			this.numero = this.matrizPecas[linha][coluna - 1];
			this.matrizPecas[linha][coluna] = this.numero;
			this.matrizPecas[linha][coluna - 1] = this.vazio;
		}
		super.setTabuleiro(this.matrizPecas);
	}
	
	
	public void mexeEsquerda() {
		achaVazio();
		
		if(coluna != super.getMatriz() - 1) {
			this.vazio = this.matrizPecas[linha][coluna];
			this.numero = this.matrizPecas[linha][coluna + 1];
			this.matrizPecas[linha][coluna] = this.numero;
			this.matrizPecas[linha][coluna + 1] = this.vazio;
		}
		super.setTabuleiro(this.matrizPecas);
	}
	
	
	public void mexeBaixo() {
		achaVazio();

		if(linha != 0) {
			this.vazio = this.matrizPecas[linha][coluna];
			this.numero = this.matrizPecas[linha - 1][coluna];
			this.matrizPecas[linha][coluna] = this.numero;
			this.matrizPecas[linha - 1][coluna] = this.vazio;
		}
		super.setTabuleiro(this.matrizPecas);
	}
	
	
	public void mexeCima() {
		achaVazio();
		
		if(linha != super.getMatriz() - 1) {
			this.vazio = this.matrizPecas[linha][coluna];
			this.numero = this.matrizPecas[linha + 1][coluna];
			this.matrizPecas[linha][coluna] = this.numero;
			this.matrizPecas[linha + 1][coluna] = this.vazio;
		}
		super.setTabuleiro(this.matrizPecas);
	}
	
	
}
