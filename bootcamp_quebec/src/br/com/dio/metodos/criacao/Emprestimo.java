package br.com.dio.metodos.criacao;

public class Emprestimo {


    public static void calcularEmprestimo(double valor, int qtdParcelas) {
        if (qtdParcelas <= 5) {
            double valorFinal = valor + (valor * getTaxaMenor());
            System.out.println("O valor final do empréstimo para " + qtdParcelas + "parcelas é de: " + valorFinal);
        } else if (qtdParcelas <= 10) {
            double valorFinal = valor + (valor * getTaxaMedia());
            System.out.println("O valor final do empréstimo para " + qtdParcelas + "parcelas é de: " + valorFinal);
        } else{
            double valorFinal = valor + (valor * getTaxaMaior());
            System.out.println("O valor final do empréstimo para " + qtdParcelas + "parcelas é de: " + valorFinal);
        }
    }

    private static double getTaxaMenor() {
        return 0.25;
    }

    private static double getTaxaMedia() {
        return 0.38;
    }

    private static double getTaxaMaior() {
        return 0.5;
    }


}
