package br.com.dio.repeticoes;

public class BreakContinue {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            if(i == 3) {
                continue;
            }
            if(i == 6) {
                break;
            }

            System.out.println(i);
        }
    }
}
