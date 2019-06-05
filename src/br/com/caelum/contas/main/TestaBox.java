package br.com.caelum.contas.main;

public class TestaBox {
    public static void main(String[] args){
        int i = 100;
        String s = "" + i;
        System.out.println(s);

        double d = 1.2;
        String s2 = "" + d;
        System.out.println(s2);

        String t = "101";
        System.out.println(t.getClass());
        int k = Integer.parseInt(t);
        System.out.println(k);
    }
}
