package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Programa;
import br.com.caelum.contas.modelo.Programa1;

public class Teste1 {

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Programa 1 valor: " + i);
            }
        }).start();
    }
}
