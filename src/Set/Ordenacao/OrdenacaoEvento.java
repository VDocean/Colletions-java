package Set.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrdenacaoEvento {
	
	private Map<LocalDate,Evento> eventosMap;

	public OrdenacaoEvento() {
		this.eventosMap = new HashMap();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		
		eventosMap.put(data, new Evento(nome,atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate,Evento> eventosTreeMap=new TreeMap<>(eventosMap); 
		System.out.println(eventosTreeMap);
	}
	
	
	public static  void  main(String []args) {
		OrdenacaoEvento eventos=new OrdenacaoEvento();
		
		eventos.adicionarEvento(LocalDate.now(), "evento 1", "atracao 1");
		eventos.adicionarEvento(LocalDate.now(), "evento 2", "atracao 2");
		eventos.adicionarEvento(LocalDate.now(), "evento 3", "atracao 3");
		
		eventos.exibirAgenda();
		
	}
}
