package Map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map<Long,Produto> estoqueProdutosMap;
	
	EstoqueProdutos(){
		estoqueProdutosMap=new HashMap();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		estoqueProdutosMap.put(cod, new Produto(nome,preco,quantidade));
	}
	
	public void exibirProduto() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque=0d;
		
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p:estoqueProdutosMap.values()) {
				valorTotalEstoque+=p.getPreco()*p.getQuantidade();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro=null;
		double maiorPreco=Double.MIN_VALUE;
		
		if(!estoqueProdutosMap.isEmpty()) {
			
			for(Produto p:estoqueProdutosMap.values()) {
				
				if(p.getPreco()>maiorPreco) {
					produtoMaisCaro=p;
				}
			}
			
		}
		return produtoMaisCaro;
	}

}
