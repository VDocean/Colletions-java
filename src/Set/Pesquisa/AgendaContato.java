package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

import Set.operacoesBasicas.Convidado;

public class AgendaContato {
	
	private Set<Contato> contatoSet;
	
	AgendaContato(){
		this.contatoSet=new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		
		contatoSet.add(new Contato(nome,numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		
		Set<Contato> contatosPornome=new HashSet<>();
		
		for(Contato c: contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPornome.add(c);
			}
		}
		
		return contatosPornome;
		
		
	}
	
	public Contato atualizarNumeroContato(String nome,int numero) {
		
		Contato contatoAtualizado=null;
		
		for(Contato c:contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(numero);
				contatoAtualizado=c;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String []args) {
		
		AgendaContato agenda=new AgendaContato();
		
		agenda.adicionarContato("Camila", 84739439);
		agenda.adicionarContato("Camila Soares", 32141443);
		agenda.adicionarContato("Raimundo", 434989439);
		
		System.out.println(agenda.pesquisarPorNome("Camila"));
		System.out.println(agenda.atualizarNumeroContato("Camila", 7837239));
		
	}
	
	
}
