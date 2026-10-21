package model;

public class Estagiario extends Funcionario {

    private String instituicaoDeEnsino;

    public Estagiario(String instituicaoDeEnsino, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }

    @Override
    public double getBonificacao() {
        return 200.0;
    }

    @Override
    public String getCargo() {
        return "Estagiário";
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        getCargo();
    }
}
