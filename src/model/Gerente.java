package model;

public class Gerente extends Funcionario {

    private int senha;
    
    public Gerente(int senha, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.15;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }
}
