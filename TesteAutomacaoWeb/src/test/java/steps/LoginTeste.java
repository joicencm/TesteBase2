package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import runner.Executa;

public class LoginTeste {

	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();
	
	@After
	public void finalizarTeste() {
		//Executa.fecharNavegador();
	}
	

	@Dado("que acesse o site mantis bug tracker")
	public void queAcesseOSiteMantisBugTracker() {
		Executa.abrirNavegador();

	}

	@Quando("informe usuario")
	public void informeUsuario() {
		metodos.escrever(elemento.getUsuario(), "joice.martins");

	}

	@Quando("clique em entrar com usuario")
	public void cliqueEmEntrarComUsuario() {
		metodos.submit(elemento.getUsuario());
	}

	@Quando("informe senha")
	public void informeSenha() {
		metodos.escrever(elemento.getSenha(), "Jo102030");

	}
	
	@Quando("clique em entrar com a senha")
	public void cliqueEmEntrarComASenha() {
		metodos.submit(elemento.getSenha());
	}
		

	@Entao("acesse as tarefas")
	public void acesseAsTarefas() {
		metodos.screenshot("CT01_Acesso_Minhas_Tarefas");

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


