package br.com.dio.metodos.sobrecarga;

public class AreaQuadrilatero {

    public static void area(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }
    public static void area(double baseMenor, double baseMaior, double altura) {

        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura));
    }
}
