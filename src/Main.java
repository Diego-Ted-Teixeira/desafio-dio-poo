import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKatiana = new Dev();
        devKatiana.setNome("Katiana");
        devKatiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Katiana: " + devKatiana.getConteudosInscritos());
        devKatiana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Katiana: " + devKatiana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Katiana: " + devKatiana.getConteudosConcluidos());
        System.out.println("XP: " + devKatiana.calcularTotalXp());

        System.out.println("------------------------------------");

        Dev devLunna = new Dev();
        devLunna.setNome("Lunna");
        devLunna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lunna: " + devLunna.getConteudosInscritos());
        devLunna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lunna: " + devLunna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lunna: " + devLunna.getConteudosConcluidos());
        System.out.println("XP: " + devLunna.calcularTotalXp());
    }
}