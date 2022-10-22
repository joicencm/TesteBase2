package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By usuario = By.xpath("//input[@id=\"username\"]");
	private By senha = By.xpath("//input[@id=\"password\"]");
	private By acessoUsuario = By.xpath("//span[@class='user-info']");
	private By criarTarefa = By.xpath("//span[text()=' Criar Tarefa ']");
	private By selecionarProjeto = By.xpath("//input[@class=\"btn btn-primary btn-white btn-round\"]");
	private By frequencia = By.xpath("//select[@id=\"reproducibility\"]//option[@value=\"10\"]");
	private By gravidade = By.xpath("//select[@id=\"severity\"]//option[@value=\"20\"]");
	private By prioridade = By.xpath("//select[@id=\"priority\"]//option[@value=\"50\"]");
	private By resumo = By.xpath("//input[@id=\"summary\"]");
	private By decricao = By.xpath("//textarea[@id=\"description\"]");
	private By enviarArquivo = By.xpath("//div[@class=\"dropzone center dz-clickable\"]");
	private By viabilidadePrivado = By.xpath("//span[text()='privado']");
	private By criarNovaTarefa = By.xpath("//input[@value=\"Criar Nova Tarefa\"]");
	private By msgLoginInvalido = By.xpath("//p[text()='Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.']");
	private By msg = By.xpath("");
	
	
	
	
	public By getFrequencia() {
		return frequencia;
	}

	public By getGravidade() {
		return gravidade;
	}

	public By getPrioridade() {
		return prioridade;
	}

	public By getResumo() {
		return resumo;
	}

	public By getDecricao() {
		return decricao;
	}

	public By getUsuario() {
		return usuario;
	}

	public By getSenha() {
		return senha;
	}

	public By getCriarTarefa() {
		return criarTarefa;
	}

	public By getSelecionarProjeto() {
		return selecionarProjeto;
	}

	public By getEnviarArquivo() {
		return enviarArquivo;
	}

	public By getViabilidadePrivado() {
		return viabilidadePrivado;
	}

	public By getCriarNovaTarefa() {
		return criarNovaTarefa;
	}

	public By getMsg() {
		return msg;
	}

	public By getMsgLoginInvalido() {
		return msgLoginInvalido;
	}

	public By getAcessoUsuario() {
		return acessoUsuario;
	}

}
