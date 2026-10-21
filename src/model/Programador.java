package model;

public class Programador extends Funcionario {

    private String linguagem;

    public Programador(String linguagem, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
    }
    
    @Override
    public double getBonificacao(){
        return getSalario() * 0.1;
    }
    
    @Override
    public String getCargo(){
        return this.linguagem;
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        getCargo();
    }
}
