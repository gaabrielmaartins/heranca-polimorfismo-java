package app;

import java.util.Scanner;

import model.Funcionario;
import model.Programador;
import model.Estagiario;
import model.Gerente;
import model.Diretor;

import service.ControleDeBonificacoes;

public class ProgramaFuncionario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programador programador = new Programador("Java", "Gabriel", "111.111.111-11", 10.000);
        Estagiario estagiario = new Estagiario("CEFET", "Bruno", "222.222.222-22", 1.000);
        //A chamada autentica() não poderia ser chamada se a variável fosse do tipo
        //Funcionario, pois a classe Funcionário não possui acesso ao método de autenticação.
        //O método de autenticação é exclusivo da classe diretor, que herda essa função da
        //classe gerente.
        Gerente gerente = new Gerente(213, "Rodrigo", "333.333.333-33", 15.000);
        Diretor diretor = new Diretor(312, "Guilerme", "333.333.333-33", 15.000);

        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();
        if (senha == 213) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado.");
        }

        ControleDeBonificacoes bonificacao = new ControleDeBonificacoes();
        
        bonificacao.registra(programador);
        bonificacao.registra(estagiario);
        bonificacao.registra(gerente);
        bonificacao.registra(diretor);
        
        Funcionario funcionario = new Funcionario();
        
    }

}
