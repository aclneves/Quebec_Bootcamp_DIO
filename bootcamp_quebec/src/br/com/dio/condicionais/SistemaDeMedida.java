package br.com.dio.condicionais;

public class SistemaDeMedida {
    public static void main(String[] args) {

        String sigla = "M";

        if (sigla.equals("P"))
            System.out.println("PEQUENO");
        else if(sigla.equals("M"))
            System.out.println("MEDIO");
        else if(sigla.equals("G"))
        System.out.println("GRANDE");

        // Switch case
        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
