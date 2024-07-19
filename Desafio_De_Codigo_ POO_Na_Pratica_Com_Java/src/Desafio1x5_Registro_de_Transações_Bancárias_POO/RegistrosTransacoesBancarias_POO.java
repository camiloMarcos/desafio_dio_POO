package Desafio1x5_Registro_de_Transações_Bancárias_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RegistrosTransacoesBancarias_POO {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        int quantidadeTransacoes = scanner.nextInt();

        List<String> listaTransacoes = new ArrayList<>();

        for(int i=1; i <=quantidadeTransacoes;i++){

            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();


            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                saldo += valorTransacao;
                listaTransacoes.add(i+". "+ "Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
                saldo -= valorTransacao;
                listaTransacoes.add(i+". "+ "Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }

        }
                System.out.println("Saldo: " + saldo);
                System.out.println("Transacoes: ");
                for(String transacoes : listaTransacoes){
                System.out.println(transacoes);

        }

        scanner.close();

    }

}




// COMENTÁRIOS:
/*
l.
    Criamos a classe
    criamos o método main
    criamos o método Scaner
    criamos o método para ler imput de dados, no caso, o usuário vai digitar o Saldo inicial da conta.
    criamos o método para ler imput de dados, no caso, o usuário vai digitar a qtde de transações q deseja realizar
    Criamos a lista para armazenar as transações:
    Implementamos um loop 'for' para iterar sobre as transações:
    Criamos o método para ler imput de dados, no caso, o usuário vai digitar o TIPO DE TRANSACAO que quer realizar, se D ou S.
    Criamos o método para ler imput de dados, no caso, o usuário após especificar o TIPO, VAI DIGITAR O VALOR DA TRANSAÇÃO.
26. Criamos o método condicional, p/ VERIFICAR O TIPO DE TRANSAÇÃO E ATUALIZAR O SALDO DA CONTA. E, em seguida, criamos um metodo para add à lista de transacoes utilizadas pelo usuário.


    // TODO: Adicione a transação à lista:
8?
 */