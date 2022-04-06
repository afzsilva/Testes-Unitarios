package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {
	
	
	@Test
	public void test() {
		
		//Verificação de argumentos boleanos
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		
		
		//Verificação de igualdade
		Assert.assertEquals(1, 1);
		
		/*observar para a informar o parametro delta
		 *nos casos em que tratar numeros float e double*/
		Assert.assertEquals(0.51, 0.51, 00.1);
		Assert.assertEquals(Math.PI, 3.14, 0.01);
		
		
		/*Wrapper class*/
		int x = 5;
		Integer y = 5;
		Assert.assertEquals(Integer.valueOf(x),y);//transformando o valor primitivo em objeto
		Assert.assertEquals(x,y.intValue());//Transformando o valor do objeto em primitivo
		
		
		/*Strings*/
		Assert.assertEquals("bola", "bola");
		//Assert.assertEquals("bola", "Bola");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		/*Para compara a igualdade de atributos do de um objeto
		 *deve ser sobrescrito o metodo equals e hascode*/
		Usuario usuario = new Usuario("Usuario1");
		Usuario usuario2 = new Usuario("Usuario1");
		Usuario u3 = usuario;
		Usuario u4 = null;
		
		Assert.assertEquals(usuario, usuario2);//verifica se os objetos possuem o mesmo valor atributos
		
		Assert.assertSame(usuario, u3);//verifica se os objetos são da mesm instancia
		
		Assert.assertNull("É nulo ",u4);//verifica se o objeto é null
		
		
		
		
		
		
		
		
		
	}

}
