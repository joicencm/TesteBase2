package steps;

import java.awt.AWTException;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import metodos.Metodos;
import runner.Executa;
import ultis.MassaDados;

public class CriarTarefaTeste {

	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();
	MassaDados dados = new MassaDados();
	
	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();
	}

	@Dado("que acesse o site martins bug tracker")
	public void queAcesseOSiteMartinsBugTracker() {
		Executa.abrirNavegador();

	}

	@Dado("que realize o login")
	public void queRealizeOLogin() {
		metodos.escrever(elemento.getUsuario(), "joice.martins");
		metodos.submit(elemento.getUsuario());
		metodos.escrever(elemento.getSenha(), "Jo102030");
		metodos.submit(elemento.getSenha());
	}

	@Dado("que esteja no menu Criar Tarefa")
	public void queEstejaNoMenuCriarTarefa() {
		metodos.clicar(elemento.getCriarTarefa());

	}

	@Dado("clico em selecionar projeto")
	public void clicoEmSelecionarProjeto() {
		metodos.clicar(elemento.getSelecionarProjeto());
	}

	@Dado("preencho os campos")
	public void preenchoOsCampos() {
		dados.preencherDetalhesDoRelatorio();

	}

	@Dado("importe um arquivo")
	public void importeUmArquivo() throws AWTException {
		metodos.clicar(elemento.getEnviarArquivo());
		metodos.uploadArquivo();

	}

	@Dado("em Viabilidade selecione opcao desejada")
	public void emViabilidadeSelecioneOpcaoDesejada() {
		metodos.clicar(elemento.getViabilidadePrivado());

	}

	@Quando("marque o campo selecione para criar mais tarefa")
	public void marqueOCampoSelecioneParaCriarMaisTarefa() {

	}

	@Quando("clicar Criar Nova Tarefa")
	public void clicarCriarNovaTarefa() {
		metodos.clicar(elemento.getCriarNovaTarefa());

	}

	@Entao("valido mensagem {string}")
	public void validoMensagem(String string) {
		metodos.aguardarElemento(20, elemento.getMsg());
		metodos.evidencia("CT01_TarefaCriada");
		
		

	}

	@Dado("que os campos obrigatorios esteja em branco")
	public void queOsCamposObrigatoriosEstejaEmBranco() {

	}

	@Entao("valido mensagem sem preenchimento {string}")
	public void validoMensagemSemPreenchimento(String string) {

	}

}
