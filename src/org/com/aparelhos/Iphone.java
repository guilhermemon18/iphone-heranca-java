package org.com.aparelhos;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando reprodução");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Selecionadno música: " + musica);
		
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Exibindo página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizandno página");
		
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Discando para o número: " + numero);
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando correio de voz");
	}

}
