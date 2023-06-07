package POOBanco06062023;

public class Pessoa {
    //Nome, CPF, Conta
    String nome;
    String sobreNome;
    String cpf;
    
    
    public Pessoa(String nome, String sobreNome, String cpf) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    
}
