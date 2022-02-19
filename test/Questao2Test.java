package br.com.academia.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.academia.capgemini.q2.Questao2;
/**
 * @author Jessica Assis
 * */
public class Questao2Test {
	/**
     * Funcao de Teste que verifica se a senha tem mais de 6 digitos
     */
	@Test
	public void senhaTemMaisDe6Digitos() {
		Assert.assertEquals(Questao2.verificaString("Senh@23"), true);
	}
	/**
     * Funcao de Teste que verifica se a senha tem menos de 6 digitos
     */
	@Test
	public void senhaTemMenosDe6Digitos() {
		Assert.assertEquals(Questao2.verificaString("Senh@"), false);
	}

}
