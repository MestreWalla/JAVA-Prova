package POOBanco06062023;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conta {

    //Criar Usuario
    Scanner sc = new Scanner(System.in);
    Pessoa pessoa01 = new Pessoa(null, null, null, null);
    //SET
    pessoa01.setNome(JOptionPane.showInputDialog("Primeiro Nome:"));
    pessoa01.setSobreNome(JOptionPane.showInputDialog("Sobre Nome:"));
    pessoa01.setCpf(JOptionPane.showInputDialog("CPF:"));
    pessoa01.setIdade(JOptionPane.showInputDialog("Idade:"));
    sc.close();
    //GET
    System.out.println("Nome Completo: " + pessoa01.getNome() + " " + pessoa01.getSobreNome());
    System.out.println("CPF: " + pessoa01.getCpf());

}
