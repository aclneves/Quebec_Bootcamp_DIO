package br.com.dio.variaveis_e_operadores;

public class Variaveis {

    public static void main(String[] args) {

        int i;
        // int i; não se pode repetir variáveis
        int I;
        // int 1I; não se pode começar variáveis com números
        int _i; // Apesar de não apresentar erro, não é uma boa prática, começa com _
        int $i; // Apesar de não apresentar erro, não é uma boa prática, começa com $

        i = 5;
        I = 10;
        _i = 15;
        $i = 20;

        final int J = 10;
        // J = 20; Final é uma constante, então não pode ser atribuído depois
        int exemplo1;
        // int exemplo 1; há um espaço no meio, o que não é permitido
        int exemplo_2; // Não é boa pratica, mas é permitido
        // int exemplo%3; não é permitido usar alguns caracteres especias, %! entre outros

        exemplo1 = 10;
        exemplo_2 = 10;

        int quantidadeProduto = 30;
        int QuantidadeProduto = 30; // apesar de não apresentar erro, não é uma boa prática;
        final int NUMERO_TENTATIVAS = 5; // Está correto, maiusculas e com _ separando os nomes
        final int numeroTentativas = 5; // Não é boa prática, deve ser maiusculas com _ separando
        int QUANTIDADE_PRODUTO = 25; // não segue a boa prática, no caso camelCase
        int qtdProd = 10; // não segue boa prática de expressividade, pois prod pode ter vários significados

        System.out.println(i);
        System.out.println(I);
        System.out.println(_i);
        System.out.println($i);
        System.out.println(J);
        System.out.println(exemplo1);
        System.out.println(exemplo_2);
        System.out.println(quantidadeProduto);
        System.out.println(QuantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(numeroTentativas);
        System.out.println(QUANTIDADE_PRODUTO);
        System.out.println(qtdProd);
    }

}
