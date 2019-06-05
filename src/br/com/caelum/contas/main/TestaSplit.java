package br.com.caelum.contas.main;

public class TestaSplit {

    public static void main(String[] args) {

    String texto = "Socorram-me, subi no ônibus em Marrocos";
    String [] inverte = texto.split(" ");

        for (int i = inverte.length - 1; i >= 0; i--) {
            System.out.print(inverte[i] + " ");
        }
    }
}

