package Controller;
import java.time.LocalDate;

import Model.*;
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	Curso cursoJava = new Curso("Curso Java", "Descrição Curso Java", 8);	
	Curso cursoJS = new Curso("Curso JS", "Descição Curso JS", 4);		
	Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Descição Mentoria Java", LocalDate.now());	
	
	
	Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer", "Descição Bootcamp Java Developer");
	
	
	Dev devDaniel = new Dev("Daniel Dantas");
	
	devDaniel.increverBootcamp(bootcampJava);
	System.out.println("Conteúdo inscrito: " + devDaniel.getConteudosInscritos());
	
	devDaniel.progredir();
	devDaniel.progredir();
	
	System.out.println("\nConteúdo inscrito: " + devDaniel.getConteudosInscritos());
	System.out.println("-\nConteúdo concluído: " + devDaniel.getConteudosConcluidos());
	
	System.out.println("XP Final: " + devDaniel.calcularXpTotal());
	
	}
}
