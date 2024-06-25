package aparelho;

import apps.AparelhoTelefonico;
import apps.NavegadorWeb;
import apps.ReprodutorMusical;

public class CelularIphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb{

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Nova Página");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz Iniciado");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Chamada");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Música Selecionada");
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando Música");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Música Pausada");
		
	}

}
