//package br.unip.sd;

/**
 * Created by dirceu on 14/03/17.
 */

public class DeadLock {
    static class Amigo {
    	private final String frase;
        private final String nome;
        public Amigo(String nome, String frase) {
            this.nome = nome;
            this.frase = frase;
        }
        
        public String getNome() {
            return this.nome;
        }

        public String getFrase() {
            return this.frase;
        }
        
        public synchronized void passar(Amigo passador) {
            System.out.printf("%s: %s  me passou a bola!%n",
                    new Object[]{this.nome, passador.getNome()});
            passador.passaDeVolta(this);
        }
        public synchronized void passaDeVolta(Amigo passador) {
            System.out.printf("%s: %s"
                            + " voltou a bola pra mim!%n",
                    new Object[]{this.nome, passador.getNome()});
        }
    }

    public static void main(String[] args) {
    	final Amigo frase =
                new Amigo("", "Quase não foi"); 
        StringBuffer sb = new StringBuffer(frase.getFrase());
        sb.reverse();
        System.out.println(sb);
        
        final Amigo neymar =
                new Amigo("Neymar", "");
        final Amigo ganso =
                new Amigo("Ganso", "");
        new Thread(new Runnable() {
            public void run() { neymar.passar(ganso); }
        }).start();
        /*new Thread(new Runnable() {
            public void run() { ganso.passar(neymar); }
        }).start();*/
    }
}
