package POOBanco06062023;

public class Pessoa {
    //Nome, CPF, Conta, idade
    String nome;
    String sobreNome;
    String cpf;
    String idade;
    
    
    public Pessoa(String nome, String sobreNome, String cpf, String idade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.idade = idade;
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
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
}
