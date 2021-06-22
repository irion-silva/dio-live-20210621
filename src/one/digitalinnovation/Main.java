package one.digitalinnovation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import one.digitalinnovation.dominio.Bootcamp;
import one.digitalinnovation.dominio.Conteudo;
import one.digitalinnovation.dominio.Curso;
import one.digitalinnovation.dominio.Dev;
import one.digitalinnovation.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Básico.");
        cursoJava.setDescricao("Aprenda os conceitos básicos de Java.");
        cursoJava.setCargaHoraria(8);
        
        Curso cursoDotNet = new Curso();
        cursoJava.setTitulo("Java .NET.");
        cursoJava.setDescricao("Aprenda os conceitos básicos de C#.");
        cursoJava.setCargaHoraria(8);
        
        Curso cursoJavaAvancado = new Curso();
        cursoJava.setTitulo("Java Avançado.");
        cursoJava.setDescricao("Aprenda os conceitos avançados sobre Java.");
        cursoJava.setCargaHoraria(8);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo Orientação a Objetos com Java.");
        mentoria.setDescricao("Imersão sobre os pilares de Orientação a Objetos.");
        mentoria.setData(LocalDateTime.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT START #2 JAVA");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(45));
        List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJava, cursoJavaAvancado, mentoria );
        bootcamp.setConteudos(conteudosBootcamp);
        
        Dev felipao = new Dev();
        felipao.setNome("Felipão");
        
        Dev venilton = new Dev();
        venilton.setNome("Venilton");
        
        felipao.inscrever(cursoDotNet);
        felipao.inscrever(bootcamp);
        felipao.progredir();
        felipao.progredir();
        
        venilton.inscrever(bootcamp);
        venilton.progredir();
        venilton.progredir();
        venilton.progredir();
        
        System.out.println(String.format("XP Felipão: %.2f", felipao.calcularTotalXp()));
        System.out.println(String.format("XP Venilton: %.2f", venilton.calcularTotalXp()));
        
        
    }

}
