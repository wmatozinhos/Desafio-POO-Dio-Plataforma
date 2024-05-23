import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		// mudança usando construtores
		Curso curso1 = new Curso("Bootcamp java", " curso java", 8);
		Curso curso2 = new Curso("Bootcamp js", " curso js", 4);
		Set<Conteudo>conteudosInscritos = new HashSet<>();
		Set<Conteudo>conteudosConcluidos =new HashSet<>();

		Mentoria mentoria = new Mentoria("mentoria de java", " mentoria java", LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
		bootcamp.addConteudo(curso1);
		bootcamp.addConteudo(curso2);
		bootcamp.addConteudo(mentoria);
		

		Dev devCamila = new Dev("camila",conteudosInscritos, conteudosConcluidos);
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
		System.out.println("XP:" + devCamila.calcularTotalXp());

		System.out.println("-------");
		Dev devJoao = new Dev("João",conteudosInscritos, conteudosConcluidos);
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		
		System.out.println("-");
		System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());

	}

}
