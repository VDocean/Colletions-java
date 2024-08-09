package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> livroList;
	
	public CatalogoLivros() {
		this.livroList=new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
	    livroList.add(new Livro(titulo,autor,anoPublicacao));
	    
	}
	
	public List<Livro> pesquisaPorAutor(String autor){
		List<Livro> livrosPorAutor=new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			
			for(Livro l: livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
			
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisaPorAno(int anoInicio, int anoFim){
		List<Livro> livrosPorAno=new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			
			for(Livro l:livroList) {
				if(l.getAnoPublicacao()>=anoInicio && l.getAnoPublicacao()<=anoFim) {
					livrosPorAno.add(l);
				}
			}
		}
		return livrosPorAno;
	}
	
	public Livro livroPorTitulo(String titulo) {
		Livro livroPorTitulo=null;
		if(!livroList.isEmpty()) {
			for(Livro l: livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo=l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	public static void main(String []args) {
		
		CatalogoLivros catalogo=new CatalogoLivros();
		
		catalogo.adicionarLivro("O mundo de sofia","Zects",1999);
		catalogo.adicionarLivro("Magico de OZ", "L. Frank Baum", 1900);
		catalogo.adicionarLivro("O cerebro de Buda", "Rick Hanson",2010);
		
		System.out.println(catalogo.livroPorTitulo("O mundo de sofia"));
		System.out.println(catalogo.pesquisaPorAutor("L. Frank Baum"));
		System.out.println(catalogo.pesquisaPorAno(2010,2010));
		
	}
}


