package Jogo;

public class Tabuleiro {
	private int matriz;
	private String[][] listaPecas;
	private int contadorMatriz;
	
	public Tabuleiro(int matriz){
		setMatriz(matriz);
	}
	
	public void setMatriz(int matriz) { //armazena o valor da matriz
		if(matriz == 3 || matriz == 4) {
			this.matriz = matriz;
		}
	}
	
	
	public void preencheArray() { //preenche os numeros da matriz
		String[][] tempArray = new String[matriz + 1][matriz + 1];
		this.contadorMatriz = 0;
		for(int i = 0; i <= matriz; i++) {
			for(int j = 0; j < matriz; j++) {
				tempArray[i][j] ="[" + String.valueOf(contadorMatriz + 1) + "]";
				contadorMatriz++;
			}
		}
		tempArray[matriz - 1][matriz - 1] = "[ ]";
		this.listaPecas = tempArray;
	}
	
}
