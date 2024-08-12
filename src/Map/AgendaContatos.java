package Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private Map<String,Integer> agendaContatosMap;
	
	AgendaContatos(){
		this.agendaContatosMap=new HashMap<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		agendaContatosMap.put(nome,numero);
	}
	
	public void removerContato(String nome) {
		
		if(!agendaContatosMap.isEmpty()) {
			agendaContatosMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatosMap);
	}
	
	public Integer pesquisaPorNome(String nome) {
		Integer numeroTelefone=null;
		if(!agendaContatosMap.isEmpty()) {
			numeroTelefone=agendaContatosMap.get(nome);
		}
		return numeroTelefone;
	}
	
	public static void main(String []args) {
		AgendaContatos agenda=new AgendaContatos();
		
		agenda.adicionarContato("nome 1", 1111111111);
		agenda.adicionarContato("nome 2", 222222222);
		agenda.adicionarContato("nome 3", 333333333);
		agenda.adicionarContato("nome 4", 444444444);
		
		agenda.exibirContatos();
		agenda.removerContato("nome 1");
		agenda.exibirContatos();
	    System.out.println(agenda.pesquisaPorNome("nome 2"));
	}
 
}
