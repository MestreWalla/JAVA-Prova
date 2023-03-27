package JAVA.ATividades27032023;

import java.util.Scanner;

/**
 * Atividades
 */
public class Atividades {
    Scanner sc = new Scanner(System.in);

    public void Atividade01() {
        // entradas
        System.out.println("Digite o nome:");
        String nome = sc.nextLine();
        System.out.println("Digite a idade:");
        int idade = sc.nextInt();
        System.out.println("Digite o sexo:");
        String sexo = sc.nextLine();
        System.out.println("Digite a altura:");
        int altura = sc.nextInt();
        System.out.println("Digite o peso:");
        int peso = sc.nextInt();
        
        // formulas
        double imc = peso/(altura*altura);
        double pesoH = 20;
        double pesoM = 20;
        double ganhar = imc-peso;
        double perder = peso-imc;

//HOMEM
        // Menor que 20 = abaixo do peso.
        // Entre 20 a 24,9 = peso normal.
        // Entre 25 a 24,9 = obesidade leva.
        // Entre 25 a 29,9 = obesidade moderada.
        // Acima de 40 = obesidade mórbida.
//MULHER
        // Menor que 19 = abaixo do peso.
        // Entre 19 a 23,9 = peso normal.
        // Entre 24 a 28,9 = obesidade leva.
        // Entre 29 a 38,9 = obesidade moderada.
        // Acima de 39 = obesidade mórbida.

        // peso ideal
        if (sexo == "masculino") {
            System.out.println("Seu peso ideal é: " + imc + "kg.");
        } else { System.out.println("Seu peso ideal é: " +imc + "kg.");
    }
    }
}