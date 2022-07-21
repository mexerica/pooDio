import desafio.Bootcamp;
import desafio.Curso;
import desafio.Dev;
import desafio.Mentoria;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descriçâo curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso javascript");
		curso1.setDescricao("descriçâo curso js");
		curso1.setCargaHoraria(6);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descriçâo mentoria java");
		mentoria.setCargaHoraria(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setTitulo("bootcamp java");
		bootcamp.setDescricao("descriçâo bootcamp java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devTiago = new Dev();
		devTiago.setNome("Tiago");
		devTiago.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Tiago:" + devTiago.getConteudosInscritos());
		devTiago.progredir();
		devTiago.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Tiago:" + devTiago.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Tiago:" + devTiago.getConteudosConcluidos());
		System.out.println("XP:" + devTiago.calcularTotalXp());
		System.out.println("--------");
		
		Dev devLinus = new Dev();
		devLinus.setNome("Linus");
		devLinus.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Linus:" + devLinus.getConteudosInscritos());
		devLinus.progredir();
		devLinus.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Linus:" + devLinus.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Linus:" + devLinus.getConteudosConcluidos());
		System.out.println("XP:" + devLinus.calcularTotalXp());
	}		
}