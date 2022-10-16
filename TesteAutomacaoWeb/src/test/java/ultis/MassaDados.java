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
	
	
	

}
