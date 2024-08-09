package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdencaoPessoa {
	
	List<Pessoa> pessoaList;

	public OrdencaoPessoa() {
		this.pessoaList=new ArrayList<>();
		
	}
	
	public void adicionarPessoa(String nome,int idade,double altura) {
		pessoaList.add(new Pessoa(nome,idade,altura));
	}

	//ordenacao por comparator
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade=new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return  pessoasPorIdade;
	}
	
	//ordenacao pelo comparable
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura=new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return  pessoasPorAltura;
	}
	
	
	public static void main(String []args) {
		
		OrdencaoPessoa pessoas=new OrdencaoPessoa();
		
		pessoas.adicionarPessoa("Vitória",27,1.58);
		pessoas.adicionarPessoa("Joao",24,1.8);
		pessoas.adicionarPessoa("Chico",3,0.3);
		
		System.out.println(pessoas.ordenarPorAltura());
		System.out.println(pessoas.ordenarPorIdade());
		
	}

}
