package steps;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import metodos.Metodos;
import runner.Executa;

public class LoginTeste {

	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();

	@Dado("que acesse o site mantis bug tracker")
	public void queAcesseOSiteMantisBugTracker() {
		Executa.abrirNavegador();

	}

	@Dado("informe a usuario")
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

}
