package Atividade30052023B;

import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Random rd = new Random(0);
        //vetor de objetos
        Agenda pessoas[] = new Agenda[10];
        //preencher o meu vetor/array
        for (int i = 0; i < pessoas.length; i++) {
            //construtor de objetos
            pessoas[i]= new Agenda();
            //preencher os atributos
            pessoas[i].setNome("Pessoa"+i);
            pessoas[i].setAltura(i);
            pessoas[i].setIdade(i+18);
        }
        //buscador
        // enquanto não achar o nome da pessoa
    }
}
