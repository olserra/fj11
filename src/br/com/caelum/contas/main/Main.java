package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setTitular("Mário");
        cc.setNumero(123);
        cc.setAgencia("0123-1");
        System.out.println(cc);

        String s = "fj11";
        String t = s.replace('1','2');
        System.out.println(t);
        System.out.println(t.length());
        System.out.println(t.charAt(1));
    }
}