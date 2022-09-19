package br.com.dio.metodos.criacao;

public class Main {

    public static void main(String[] args) {

        // Caluladora
        System.out.println("Exercício br.com.dio.primeiroCapitulo.Calculadora");
        Calculadora.soma(5, 4);
        Calculadora.subtracao(9, 3.5);
        Calculadora.multiplicacao(3, 5.5);
        Calculadora.divisao(10,2);

        // br.com.dio.primeiroCapitulo.Mensagem
        System.out.println("\nExercício br.com.dio.primeiroCapitulo.Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(45);

        // br.com.dio.primeiroCapitulo.Emprestimo
        System.out.println("\nExercício Empréstimo");
        Emprestimo.calcularEmprestimo(5000, 2);
        Emprestimo.calcularEmprestimo(5000, 7);
        Emprestimo.calcularEmprestimo(5000, 12);
    }
}
