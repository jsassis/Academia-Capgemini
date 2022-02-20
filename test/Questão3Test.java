	package br.com.academia.capgemini.test;


import org.junit.Assert;
import org.junit.Test;


import br.com.academia.capgemini.q3.Questao3;
/**
 * @author Jessica Assis
 * 
 * */
public class Questão3Test {
	/**
     * Funcao de Teste que verifica se o quantos anagramas tem a palavra ovo 
     */
	@Test
	public void compararAnagramaOvo() {
		Assert.assertEquals(Questao3.verificarAnagrama("ovo"), 3);
		
	}
	/**
     * Funcao de Teste que verifica se o quantos anagramas tem a palavra ifailuhkqq 
     */
	@Test
	public void compararAnagramaIfailuhkqq() {
		Assert.assertEquals(Questao3.verificarAnagrama("ifailuhkqq"), 4);
		
	}

}
