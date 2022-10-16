package steps;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import runner.Executa;

public class LoginTeste {

	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();

	@Dado("que acesse o site mantis bug tracker")
	public void queAcesseOSiteMantisBugTracker() {
		Executa.abrirNavegador();

	}

	@Quando("informe a usuario")
	public void informeAUsuario() {
		metodos.escrever(elemento.getUsuario(), "joice.martins");

	}

	@Dado("clicar para entrar com usuario")
	public void clicarParaEntrarComUsuario() {
		metodos.submit(elemento.getUsuario());
	}

	@Dado("informe a senha")
	public void informeASenha() {
		metodos.escrever(elemento.getSenha(), "Jo102030");

	}

	@Entao("acesse as tarefas")
	public void acesseAsTarefas() {
		metodos.submit(elemento.getSenha());
	

	}
	
	
	@Quando("avancar sem o usuario")
	public void avancarSemOUsuario() {
	    metodos.submit(elemento.getUsuario());
	}
	@Entao("informe valide mensagem {string}")
	public void informeValideMensagem(String string) {
		metodos.validarMensagem(elemento.getMsgLoginInvalido(), string);
	   
	}




}
