package Desafio5x5_Cofres_Seguros_Dominando_o_Encapsulamento_e_Abstração;

import java.util.Scanner;


public class Desafio5x5 {

    public static void main(String[] args) {
// Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

// Foi Implementado a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha1 = scanner.nextInt();
            int senha2 = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha1);
            cofreDigital.imprimirInformacoes();
            if (cofreDigital.validarSenha(senha2) == true){
                System.out.println("Desafio5x5_Cofres_Seguros_Dominando_o_Encapsulamento_e_Abstração.Cofre aberto!");
            }else{
                System.out.println("Senha incorreta!");
            }

        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
    }
}



abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Desafio5x5_Cofres_Seguros_Dominando_o_Encapsulamento_e_Abstração.Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Desafio5x5_Cofres_Seguros_Dominando_o_Encapsulamento_e_Abstração.Cofre Fisico", "Chave");
    }

}
