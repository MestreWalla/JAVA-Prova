package Exercicio30052023;

import java.util.Random;

import javax.swing.JOptionPane;

import Atividade30052023.Pessoa;

public class App {
    public static void main(String[] args) {
        Random rd = new Random(0);
        // Vetor de objetos
        Agenda pessoas[] = new Agenda[10];
        // Preencher o meu vetor/array
        for (int i = 0; i < pessoas.length; i++) {
            // Construtor de objetos
            pessoas[i] = new Agenda();
            // Preencher os atributos
            pessoas[i].setNome("Pessoa" + i);
            pessoas[i].setAltura(i);
            pessoas[i].setIdade(i + 18);
        }
        // Buscador
        String nomeDigitado = JOptionPane.showInputDialog("Nome Buscado:");
        // Enquanto nomeDigitado != nome do Objeto
        // Cont e procure
        int cont = 0;
        boolean teste = true;
        while (!nomeDigitado.equals(pessoas[cont].getNome())) {
            cont++;
        }
        System.out.println("Nome: " + pessoas[cont].getNome()
                + "Idade: " + pessoas[cont].getIdade()
                + "Altura: " + pessoas[cont].getAltura());
    }
}