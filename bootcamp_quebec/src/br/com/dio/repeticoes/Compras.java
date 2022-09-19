package br.com.dio.repeticoes;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Compras {
    public static void main(String[] args) {
        BigDecimal mesada = new BigDecimal("50.0");
        int totalDoces = 0;

        while(mesada.compareTo(BigDecimal.valueOf(0)) > 0)  {

            BigDecimal valorDoce = BigDecimal.valueOf(valorAleatorio()).setScale(2, RoundingMode.HALF_EVEN);
            if(valorDoce.compareTo(mesada) > 0)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionando no carrinho");
            mesada = mesada.subtract(valorDoce);
            System.out.println("Restam " + mesada + " reais.");
            totalDoces++;
        }

        System.out.println("Joãozinho comprou " + totalDoces + " doces");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 7);
    }
}
