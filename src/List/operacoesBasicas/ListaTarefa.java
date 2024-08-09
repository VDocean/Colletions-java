package List.operacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	private List<Tarefa> tarefaList;
	

	public ListaTarefa() {
		this.tarefaList=new ArrayList<>();
		
	}
	
	public void adicionarTarefas(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover=new ArrayList<>();
		
		for(Tarefa t: tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)){
				tarefasParaRemover.add(t);
				
				
			}
			
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public static void main(String []args) {
		
		ListaTarefa listaTarefa=new ListaTarefa();
		
		System.out.println("O número total de tarefas é: "+listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefas("JAVA");
		listaTarefa.adicionarTarefas("Testes Unitários");
		listaTarefa.adicionarTarefas("AWS");
		
		System.out.println("O número total de tarefas é: "+listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("AWS");
		
		System.out.println("O número total de tarefas é: "+listaTarefa.obterNumeroTotalTarefas());
		
		
		
		
		
		 
	}

}
