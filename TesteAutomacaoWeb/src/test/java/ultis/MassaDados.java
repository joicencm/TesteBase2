package ultis;

import elementos.Elementos;
import metodos.Metodos;

public class MassaDados {
	
	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();
	
	public void preencherDetalhesDoRelatorio() {
		metodos.clicar(elemento.getFrequencia());
		metodos.clicar(elemento.getFrequencia());
		metodos.clicar(elemento.getPrioridade());
		metodos.escrever(elemento.getResumo(), "Automacao01");
		metodos.escrever(elemento.getDecricao(), "Realizando teste automatizado");
	}
	
	public void login() {
		metodos.escrever(elemento.getUsuario(), "joice.martins");
		metodos.submit(elemento.getUsuario());
		metodos.escrever(elemento.getSenha(), "Jo102030");
		metodos.submit(elemento.getSenha());
	}
	
	
	

}
