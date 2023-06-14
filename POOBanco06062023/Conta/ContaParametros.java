package POOBanco06062023.Conta;

import javax.swing.JOptionPane;

public class ContaParametros {
    // atributos comuns
    private int nConta;
    private double saldo;

    // métodos
    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // métodos opcionais
    public void saque() {
        double saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Saque"));
        if (saque > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        } else {
            saldo -= saque;
        }
    }

    public void transferir() {
        double transferir = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da transferencia"));
        if (transferir > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        } else {
            saldo -= transferir;
            int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
            for (i = 0; i < contPJ.length; i++) {
                    if (nContaBuscada == clientePJ[i].getnConta()) {
                    JOptionPane.showMessageDialog(null, "Deposito Realizado");
                    clientePJ[i] += transferir;
                } else {
                    JOptionPane.showMessageDialog(null, "Conta não encontrada");
                }
            }
        }
    }

    public void deposito() {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Deposito"));
        saldo += deposito;
    }

    public void emprestimo() { //GENEROSO
        double emprestimo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que precisa"));
        saldo += emprestimo;
    }
}
