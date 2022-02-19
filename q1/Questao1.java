package br.com.academia.capgemini.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jessica Assis
 * */
public class Questao1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		List<String> degraus = new ArrayList<String>();
		int qtd = pegarValor(sc);
		List<String> escada = percorreLista(qtd, degraus);
		imprimeLista(escada);
	}
/**
 * Metodo que recebe uma lista e imprime ela
 * @param escada
 * @return degraus
 * */
	public static void imprimeLista(List<String> escada) {
		for (String e : escada) {
			System.out.println(e);
		}
	}
	/**
	 * Metodo que percorre uma lista
	 * @param qtd, degraus
	 * @return degraus
	 * */
	public static List<String> percorreLista(int qtd, List<String> degraus) {
		for (int i = 0; i < qtd; i++) {
			degraus.add(" ".repeat(qtd - i) + "*".repeat(i + 1));

		}
		return degraus;

	}
	/**
	 * Metodo que recebe um Scanner , e pergunta um numero
	 * @param sc
	 * @return qtd
	 * */
	public static int pegarValor(Scanner sc) {
		System.out.println("Digite um numero: ");
		int qtd = sc.nextInt();
		return qtd;
	}

}
