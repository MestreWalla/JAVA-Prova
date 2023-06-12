package POOBanco06062023;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5]; // Criar 5 contas
        Scanner sc = new Scanner(System.in);
        boolean opcao = true;
        String opcoes = JOptionPane.showInputDialog("Informe a ação desejada\n1-Logar\n2-Cadastrar\n3-Encerrar");


        while (opcoes != null) {
            int acao  = Integer.parseInt(opcoes);
            switch (acao) {
                case 1:
                    System.out.println("LOGIN");
                    Conta.realizarLogin(contas);
                    break;
                case 2:
                    System.out.println("CADASTRO");
                    Conta.cadastrar(contas);
                    break;
                case 3:
                    opcao = false;
                    break;
                default:
                    System.out.println("Informe um número válido");
                    break;
            }
        }
    }
}
