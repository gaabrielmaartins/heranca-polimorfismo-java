package model;

public class Diretor extends Gerente {

    public Diretor(int senha, String nome, String cpf, double salario) {
        super(senha, nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000.0;
    }

    @Override
    public String getCargo() {
        return "Diretor";
    }
}
