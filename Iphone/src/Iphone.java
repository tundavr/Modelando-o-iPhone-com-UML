import App.Navegador;
import App.AparelhoTelefonico;
import App.Musica;

public class Iphone implements AparelhoTelefonico, Navegador, Musica {
	

	public void selecionarMusica(String musica) {		
		System.out.println("MUSICA SELECIONADA: " + musica);
	}


	public void tocar() {
		System.out.println("\nTOCANDO MUSICA SELECIONADA...");		
	}
	
	public void pausar() {
		System.out.println("\nMUSICA PAUSADA");		
	}

	public void atualizarAba() {
		System.out.println("ATUALIZANDO ABA");
	}

	public void adicionarNovaAba() {
		System.out.println("\nNOVA ABA ADCIONADA");		
	}

	public void exibirPagina(String url) {
		System.out.println("\nACESSANDO URL: " + url);
	}

	public void atender() {		
		System.out.println("\nLIGAÇÃO ATENDIDA COM SUCESSO!");		
		System.out.println("LIGAÇÃO ATENDIDA ENCERRADA!");
	}

	public void iniciarCorreioVoz() {		
		System.out.println("\nLIGAÇÃO RECUSADA! INICIANDO CORREIO DE VOZ...");
	}

	public void ligar(String numero) {
		System.out.println("\nLIGANDO PARA: " + numero);
		System.out.println("LIGAÇÃO CONCLUIDA COM SUCESSO!");
	}

	@Override
	public String toString() {
		return "Iphone []";
	}
}
