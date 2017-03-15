package br.unip.sd;


import java.util.Scanner;

/**
 * Created by dirceu on 14/03/17.
 */
public class Deadlocka {
    static class Amigo {
        private final String nome;
        public Amigo(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return this.nome;
        }
        public synchronized void passar(Amigo passador) {
            System.out.printf("%s: %s  me passou a bola!%n",
                    new Object[]{this.nome, passador.getNome()});
            passador.passaDeVolta(this);
        }
        public void passaDeVolta(Amigo passador) {
            System.out.printf("%s: %s"
                            + " voltou a bola pra mim!%n",
                    new Object[]{this.nome, passador.getNome()});
        }
    }

    public static void main(String[] args) {
    	
Scanner ent = new Scanner(System.in);
    	
    	double carb;
    	double cont;
    	
    	System.out.print("Informe o numero de Carboidratos: ");
    	carb = ent.nextDouble();
    	
    	cont = carb/10;
    	
    	System.out.println("O numero de humalog é: "+ cont + " ");
    	
        final Amigo neymar =
                new Amigo("Neymar");
        final Amigo ganso =
                new Amigo("Ganso");
        
        System.out.println("################ PING PONG ######################");
        
        new Thread(new Runnable() {
            public void run() { neymar.passar(ganso); }
        }).start();
        new Thread(new Runnable() {
            public void run() { ganso.passar(neymar); }
        }).start();
    }
}