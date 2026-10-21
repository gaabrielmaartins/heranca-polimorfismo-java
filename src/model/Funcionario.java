package model;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public abstract double getBonificacao();
    
    public abstract String getCargo();
    
    public void exibirDados(){
        System.out.println("Cargo: " + getCargo() + "\nNome: " + this.nome + "\nCPF: " +
        this.cpf + "\nSalário: " + this.salario + "\nBonificação: " + getBonificacao());
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
    
}
