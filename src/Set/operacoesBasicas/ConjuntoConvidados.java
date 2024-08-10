package Set.operacoesBasicas;


import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado> convidadosSet;
	
	ConjuntoConvidados(){
		this.convidadosSet=new HashSet<>();
	}
	
	public void adicionarConvidado(String nome,int codigoConvite) {
		convidadosSet.add(new Convidado(nome,codigoConvite));
	}
	
	
	public Convidado removerConvidado(int CodConvidado) {
		
		Convidado convidadoARemover=null;
		for(Convidado c: convidadosSet) {
			if(c.getCodigoConvite()==CodConvidado) {
				convidadoARemover=c;
				convidadosSet.remove(convidadoARemover);
				break;
			}
		}
		return convidadoARemover;
	}
	
	public int numeroConvidados() {
		return convidadosSet.size();
	}
   
	public void exibirConvidados() {
		System.out.println(convidadosSet);
	}
	
	public static void main (String [] args) {
		ConjuntoConvidados conjuntoDeConvidados=new ConjuntoConvidados(); 
		
		conjuntoDeConvidados.adicionarConvidado("Maria",434);
		conjuntoDeConvidados.adicionarConvidado("Pedro",879);
		conjuntoDeConvidados.adicionarConvidado("Melissa",865);
		
		conjuntoDeConvidados.exibirConvidados();
		System.out.println(conjuntoDeConvidados.removerConvidado(434));
		System.out.println(conjuntoDeConvidados.numeroConvidados());
		
	}
}
