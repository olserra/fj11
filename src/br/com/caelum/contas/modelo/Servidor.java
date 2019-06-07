package br.com.caelum.contas.modelo;

import sun.awt.windows.ThemeReader;
import java.util.*;
import java.net.*;
import java.io.*;

public class Servidor {

    public static void main(String[] args) throws IOException {
        new Servidor(12345).executa();
    }

    private int porta;
    private List<PrintStream> clientes;

    public Servidor(int porta) {
        this.porta = porta;
        this.clientes = new ArrayList<PrintStream>();
    }

    public  void executa() throws IOException {
        ServerSocket servidor = new ServerSocket(this.porta);
        System.out.println("Porta 12345 aberta");

        while (true) {
            Socket cliente = servidor.accept();
            System.out.println("nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());

            PrintStream ps = new PrintStream(cliente.getOutputStream());
            this.clientes.add(ps);

            TrataCliente tc = new TrataCliente(cliente.getInputStream(), this);
            new Thread(tc).start();
        }
    }

    public void distribuiMensagem(String msg) {
        for (PrintStream cliente : this.clientes) {
            cliente.println(msg);
        }
    }
}
