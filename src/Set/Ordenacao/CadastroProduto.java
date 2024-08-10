package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
	
	private Set<Produto> produtoSet;
	
	CadastroProduto(){
		produtoSet=new HashSet<>();
	}
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		
		produtoSet.add(new Produto(codigo,nome,preco,quantidade));
		
	}
	
	public Set<Produto> exibirProdutoPorNome(){
		Set<Produto> produtoPorNome=new TreeSet<>(produtoSet);
		return produtoPorNome;
	}
	
	public Set<Produto> ProdutoPorPreco(){
		Set<Produto> produtoPoPreco=new TreeSet<>(new ComparatorPorPreco());
		produtoPoPreco.addAll(produtoSet);
		return produtoPoPreco;
	}
	
	public static void main (String []args) {
		CadastroProduto produtos=new CadastroProduto();
		
		produtos.adicionarProduto(87878788, "produto1", 15d, 45);
		produtos.adicionarProduto(48374983, "produto2", 19d, 45);
		produtos.adicionarProduto(21212121, "produto3", 3d, 45);
		produtos.adicionarProduto(76767676, "produto4", 8d, 45);
		produtos.adicionarProduto(54545454, "produto5", 10d, 45);
		
		System.out.println(produtos.exibirProdutoPorNome());
		System.out.println(produtos.ProdutoPorPreco());
	}

}
