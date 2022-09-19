package br.com.dio.condicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 7;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 4)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        // Ternário

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
