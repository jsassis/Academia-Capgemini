package br.com.academia.capgemini.q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jessica Assis
 */
public class Questao3 {

	public static void main(String[] args) {
		verificarAnagrama(pegarPalavra());
	}

	/**
	 * Metodo que pergunta uma palavra
	 * 
	 * @return sc
	 */
	public static String pegarPalavra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		return sc.nextLine();

	}

	/**
	 * Metodo que recebe uma palavra e verifica os anagramas contidos nela
	 * 
	 * @param anagrama
	 */
	public static int verificarAnagrama(String anagrama) {
		ArrayList<String> anagramas = new ArrayList<String>();

		for (int i = 0; i < anagrama.length(); i++) {
			for (int j = 1; j < anagrama.length(); j++) {
				if (anagrama.charAt(i) == anagrama.charAt(j) && i != j && i < j) {
					if (anagrama.charAt(i) == anagrama.charAt(i + 1)) {
						String ana1 = anagrama.substring(i, i + 1);
						anagramas.add(ana1);
					} else {
						String ana2 = anagrama.substring(i, j);
						String ana3 = anagrama.substring(i + 1, j + 1);
						String ana4 = anagrama.substring(i, i + 1);
						anagramas.add(ana2);
						anagramas.add(ana3);
						anagramas.add(ana4);
					}
				}
			}
		}

		System.out.println(anagramas);
		System.out.println(anagramas.size());
		return anagramas.size();

	}
}
