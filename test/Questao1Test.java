package br.com.academia.capgemini.test;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import br.com.academia.capgemini.q1.Questao1;
/**
 * @author Jessica Assis
 * */
public class Questao1Test {
	/**
     * Funcao de Teste que compara os valores de entrada da função com a quantidade
     *@param valor, qtd
     */
	@Test
	public void compararValorDaEscada() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int qtd = sc.nextInt();
		Assert.assertEquals(Questao1.pegarValor(sc), qtd);
		
	}

}
