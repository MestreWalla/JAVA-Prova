package ExerciciosWhile;

import java.util.Scanner;

/**
 * ExerciciosWhile
 */
public class ExerciciosWhile {
    Scanner sc = new Scanner(System.in);

    public void Exercicio04() {
        // Faça um programa que leia um vetor de 10 caracteres, e diga quantas
        // consoantes foram lidas. Imprima as consoantes.
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }; // Declaração e criação de um vetor de strings
        int i = 0; // Variável de controle do loop para iterar sobre o vetor letras
        int consoantes = 0; // Variável para contagem de consoantes, iniciando em 0
        int vogais = 0; // Variável para contagem de vogais
        // Leitura dos caracteres do vetor letras
        while (i < letras.length) { // Loop while para ler os caracteres do usuário e armazená-los no vetor letras
            if (letras[i].equalsIgnoreCase("a") || letras[i].equalsIgnoreCase("e") || letras[i].equalsIgnoreCase("i")
                    || letras[i].equalsIgnoreCase("o") || letras[i].equalsIgnoreCase("u")) {// Verificar se é vogal
                vogais++; // Incrementa o contador de vogais
                System.out.println(letras[i] + " é vogal"); // Imprime a letra atual se for uma vogal
            } else {
                consoantes++; // Incrementa o contador de consoantes
                System.out.println(letras[i] + " é consoante"); // Imprime a letra atual se for uma consoante
            }
            i++; // Incrementa o iterador do loop
        }
        System.out.println("O nº de consoantes é " + consoantes); // Imprime o número de consoantes
        System.out.println("O nº de vogais é " + vogais); // Imprime o número de vogais
    }

    public void Exercicio05() {
                    // Declaração e inicialização de um vetor de strings chamado letras com 26 letras do alfabeto
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", };
        int i = 0; // Variável de controle do loop para iterar sobre o vetor letras
        int consoantes = 0; // Variável para contagem de consoantes, iniciando em 0
        while (i < letras.length) { // Loop while para iterar sobre cada letra do vetor letras
            switch (letras[i]) { // Utilização de um switch para verificar cada letra
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break; // Caso a letra seja uma vogal, não faz nada e passa para a próxima letra
                default: // Similar ao else
                    consoantes++; // Caso a letra seja uma consoante, incrementa o contador de consoantes
                    System.out.println(letras[i] + " é consoante"); // Imprime a letra atual se for uma consoante
            }
            i++;
        }
        System.out.println("o nº de consoantes é " + consoantes); // Imprime o número de consoantes contadas
    }
}