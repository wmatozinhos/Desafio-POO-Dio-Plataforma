package Model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudosInscritos = new HashSet<>();
	private Set<Conteudo> conteudosConcluidos = new HashSet<>();
	
	
	public Dev(String nome) {
		super();
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}


	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}


	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}


	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}


	public void increverBootcamp(Bootcamp bootcamp){
	
	this.conteudosInscritos.addAll(bootcamp.getConteudos());
	
	bootcamp.getDevsInscritos().add(this); 	
	}
	
	
	public void progredir() {
	
	Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
	
	if (conteudo.isPresent()) { this.conteudosConcluidos.add(conteudo.get());  this.conteudosInscritos.remove(conteudo.get());  }
	else { System.out.println("\nVocê não está presente em nenhum conteúdo!"); }	
	}
	
	
	public double calcularXpTotal() {
	double soma = 0;	
	
	Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
	
	while (iterator.hasNext()) {
		double next = iterator.next().calcularXP();
		soma += next;
		
	}return soma;
   }


	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
	
	
}
