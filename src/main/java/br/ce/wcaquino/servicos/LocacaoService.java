package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.utils.DataUtils.adicionarDias;

import java.util.Date;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;

public class LocacaoService {
	
	public Locacao alugarFilme(Usuario usuario, Filme filme) {
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar método para salvar
		
		return locacao;
	}

	public static void main(String[] args) {
		
		//Cenário
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuario1");		
		Filme filme = new Filme("O Gladiador",2 ,5.0);
		
		//ação
		Locacao locacao = service.alugarFilme(usuario, filme);
		
				
		//Verificação
		System.out.println("Usuario1".equals(locacao.getUsuario().getNome())); //minha solução inicial
		
		System.out.println(locacao.getValor());
		System.out.println(locacao.getDataLocacao());
		System.out.println(locacao.getDataRetorno());
		
		
		
	}
}