package Jogo;
import java.util.*;

public class Tabuleiro {
	private int matriz;
	private String[] listaPecas;
	private int contadorMatriz;
	
	public Tabuleiro(int matriz){
		setMatriz(matriz);
	}
	
	
	public void setMatriz(int matriz) { //armazena o valor da matriz
		if(matriz == 3 || matriz == 4) {
			this.matriz = matriz;
		}
	}
	
	
	public void preencheArray() {
		String[] tempArray = new String[matriz*matriz]; //array temporário que armazena a ordem
		for(int i = 0; i < matriz*matriz; i++) {
			tempArray[i] = "[" + String.valueOf(i + 1) + "]";
		}
		this.listaPecas = tempArray; 
		listaPecas[listaPecas.length - 1] = "[ ]";
	}
	
	
	public void embaralhaArray() {
        List<String> list =Arrays.asList(listaPecas); //embaralha o array que contém as pecas
        Collections.shuffle(list);
        list.toArray(listaPecas);
	}
	
	
	public void exibeMatriz() { //printa os numeros do array de pecas em forma de matriz
		this.contadorMatriz = 0;
        for(int i = 0; i < matriz; i++) {
            for(int k = 0; k < matriz; k++) {
                System.out.print(listaPecas[contadorMatriz] + "\t"); //escreve no console enquanto não há interface
                contadorMatriz++;
            }
            System.out.println();
        }
	}
	
}
