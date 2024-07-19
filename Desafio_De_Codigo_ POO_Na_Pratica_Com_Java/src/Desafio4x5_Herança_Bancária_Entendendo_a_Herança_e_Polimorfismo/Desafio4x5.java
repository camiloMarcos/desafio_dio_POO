package Desafio4x5_Herança_Bancária_Entendendo_a_Herança_e_Polimorfismo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio4x5 {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);

        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(titular, numeroConta, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancaria {

    protected String titular;
    protected int numero;
    protected double saldo;

    public ContaBancaria (String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca (String titular, int numero, double saldo, double taxaJuros) {
        super(titular ,numero, saldo);
        this.taxaJuros = taxaJuros; //TODO: Implementar adequadamente esta sobrecarga de construtores.
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
//  Complementar as informações com a taxa de juros.
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros)+"%");
    }
}