package org.example;

import org.example.dominio.BootCamp;
import org.example.dominio.Curso;
import org.example.dominio.Dev;
import org.example.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("Curso de Java", "Um curso de POO e Java moderno", 40);
        Curso c2 = new Curso("Curso de Java 2", "Continuação de POO", 40);
        Mentoria m1 = new Mentoria("Aplicação em Java", "Mentoria criando um software com Java", LocalDate.now());

        BootCamp bootCamp = new BootCamp("Java do zero", "Aprendendo java do zero", LocalDate.now());
        bootCamp.getConteudos().add(c1);
        bootCamp.getConteudos().add(c2);
        bootCamp.getConteudos().add(m1);

        Dev dev1 = new Dev("Mário");
        Dev dev2 = new Dev("Mária");

        dev1.inscreverBootCamp(bootCamp);
        dev2.inscreverBootCamp(bootCamp);

        dev1.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("----------------------------");
        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXP());
        System.out.println("----------------------------");
        System.out.println(dev2.getConteudosInscritos());
        System.out.println(dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXP());
        System.out.println("----------------------------");
    }
}