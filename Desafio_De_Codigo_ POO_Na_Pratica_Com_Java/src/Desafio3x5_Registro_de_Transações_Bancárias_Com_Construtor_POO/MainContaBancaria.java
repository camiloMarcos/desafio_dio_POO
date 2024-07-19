package Desafio3x5_Registro_de_Transações_Bancárias_Com_Construtor_POO;
// foi importado a classe scanner.
import java.util.Scanner;
// foi criado a Classe MainConta Bancária.
public class MainContaBancaria {
// foi criado o método Main.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoInicial = scanner.nextDouble();
//  Criar uma nova conta bancária com o saldo inicial
        ContaBancaria conta = new ContaBancaria(saldoInicial);
//  Aqui é o método que lêr o imput do valor a ser depositado pelo usuário, e chamar o método correspondente.
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

// aqui é o método de imprimir uma mensagem indicando que o SALDO ATUAL.
        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());

//  Aqui é o método que lêr o imput do VALOR A SER SACADO pelo usuário, e chamar o método correspondente.
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

// aqui é o método de imprimir uma mensagem indicando que o SALDO ATUAL.
        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());

        // Aqui fechamos o scanner para evitar vazamento de recursos:
        scanner.close();
    }
}







//  Foi Criado uma classe Desafio3x5_Registro_de_Transações_Bancárias_Com_Construtor_POO.ContaBancaria:
class ContaBancaria {

//  Foi Criado uma variável para armazenar o saldo da conta
    private double saldo;

//  Foi Criado o construtor que inicializa a conta com um saldo inicial fornecido pelo usuário:
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

// foi criado o método para REALIZAR DEPÓSITO na conta:
    public void depositar(double valor) {
// Aqui é incrementado o saldo da conta com o valor do depósito:
        this.saldo += valor;
// aqui é o método de imprimir uma mensagem indicando que o depósito foi feito:
        System.out.println("Deposito feito.");
    }

// Foi Criado o Método para REALIZAR SAQUE da conta:
    public void sacar(double valor) {
        if (valor > saldo) {        // Verificamos se o valor do saque é maior que o saldo disponível na conta:
            System.out.println("Saldo insuficiente. Saque não realizado.");     // Se for, imprime uma mensagem informando que o saque não pode ser realizado por saldo insuficiente:
        } else {
            this.saldo -= valor;    // Caso contrário, realiza o saque subtraindo o valor do saldo da conta:
            System.out.println("Saque feito.");     // Imprime uma mensagem indicando que o saque foi feito:
        }
    }

    // Método para obter o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }
}
