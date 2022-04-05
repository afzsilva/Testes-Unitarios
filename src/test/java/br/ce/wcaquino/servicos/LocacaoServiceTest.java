package br.ce.wcaquino.servicos;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	
	@Test
	public void teste() {
		
		//Cenário
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuario1");		
		Filme filme = new Filme("O Gladiador",2 ,5.0);
		
		//ação
		Locacao locacao = service.alugarFilme(usuario, filme);
		
				
		//Verificação		
		//cenario feliz
		Assert.assertTrue(locacao.getValor() == 5.0);
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(),new Date()));
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));		
		
	}

}
