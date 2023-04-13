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
        String letras[] = new String[10]; // Declaração e criação de um vetor de strings chamado letras com tamanho 10
        int i = 0; // Variável de controle do loop para iterar sobre o vetor letras
        int cont = 0; // Variável para contagem de consoantes, iniciando em 0

        // Leitura dos caracteres do vetor letras
        while (i < letras.length) { // Loop while para ler os caracteres do usuário e armazená-los no vetor letras
            if (letras[i].equalsIgnoreCase("a") || letras[i].equalsIgnoreCase("e") || letras[i].equalsIgnoreCase("i")
                    || letras[i].equalsIgnoreCase("o") || letras[i].equalsIgnoreCase("u")) {
                // Condição para verificar se a letra é uma vogal, ignorando
                // maiúsculas/minúsculas

            } else {
                cont++; // Incrementa o contador de consoantes
                System.out.println(letras[i] + " é consoante"); // Imprime a letra atual se for uma consoante
                System.out.println();
            }
            i++; // Incrementa o iterador do loop
        }
        System.out.println("O nº de consoantes é " + cont); // Imprime o número de consoantes contadas
    }
}