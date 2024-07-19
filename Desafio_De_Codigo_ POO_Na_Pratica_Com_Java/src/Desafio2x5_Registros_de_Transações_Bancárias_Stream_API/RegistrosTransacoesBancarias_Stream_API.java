package Desafio2x5_Registros_de_Transações_Bancárias_Stream_API;/*  Orientação a Objetos na Prática com Java</h1>
    Desafio4x5_Herança_Bancária_Entendendo_a_Herança_e_Polimorfismo.Desafio de código 2/5da DIO - Registro de Transações Bancárias com Stream API
    <b>Note:</b> Desenvolvido na linguagem Java.
    @author  Marcos Camilo
    @since   11/07/2024
   */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrosTransacoesBancarias_Stream_API {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

                for (int i = 1; i <= quantidadeTransacoes; i++) {
                char tipoTransacao = scanner.next().charAt(0);

                double valorTransacao = scanner.nextDouble();

                Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
                transacoes.add(transacao);
                   // Aqui é atualizado o saldo da conta com base no tipo de transação
                    if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
                        saldo += valorTransacao;
                    } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') {
                        saldo -= valorTransacao;
                    }
                }

                // Exibe o saldo final e a lista de transações ao final do processo usando Stream API
                System.out.println("Saldo: " + saldo);
                System.out.println("Transações:");

                // TODO: Crie um fluxo (stream) a partir da lista de transações:
                transacoes.stream()
                .filter(transacao -> transacao.getTipo() == 'D' || transacao.getTipo() == 'd' || transacao.getTipo() == 'S' || transacao.getTipo() == 's')
                // TODO: Mapeie cada transação para uma string formatada:
                .map(t -> t.getTipo() + " de " + t.getValor())
                // TODO: Colete os elementos do fluxo em uma lista:
                .toList()
                // TODO: Para cada elemento da lista, imprime no console:
                .forEach(System.out::println);

                scanner.close();
            }
        }

        class Transacao {
            private char tipo;
            private double valor;

            public Transacao(char tipo, double valor) {
                this.tipo = tipo;
                this.valor = valor;
            }

            public char getTipo() {
                return tipo;
            }

            public double getValor() {
                return valor;
            }
        }

    }
}