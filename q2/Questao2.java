package br.com.academia.capgemini.q2;

import java.util.Scanner;
/**
 * @author Jessica Assis
 * */
public class Questao2 {

	public static void main(String[] args) {
		verificaString(digiteSenha());
	}
	/**
	 * Metodo que recebe uma String e faz a verificação 
	 * @param senha
	 * @return boolean
	 * */
	public static Boolean verificaString(String senha) {
		if (senha.length() >= 6) {
			System.out.println("Senha contem "+senha.length() + "");
			return true;
		}else {
			int qtdFalta = 6 - senha.length();
			System.out.println(qtdFalta);
			return false;
		}
		
		
	}
	/**
	 * Metodo que pergunta a senha, e a retorna
	 * @param sc
	 * @return senha
	 * */
	public static String digiteSenha() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		String senha = sc.nextLine();
		return senha;
		
	}

}
