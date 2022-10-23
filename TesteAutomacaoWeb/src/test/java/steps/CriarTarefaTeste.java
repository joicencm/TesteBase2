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
		dados.login();
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
//		metodos.clicar(elemento.getCriarNovaTarefa());

	}

	@Entao("valido mensagem {string}")
	public void validoMensagem(String string) {
//		metodos.validarMensagem(elemento.getMsg(), string);
//		metodos.aguardarElemento(300, elemento.getMsg());
//		metodos.screenshot("CT01_TarefaCriada");

	}

}
