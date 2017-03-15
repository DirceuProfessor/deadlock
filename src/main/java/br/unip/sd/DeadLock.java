package br.unip.sd;

/**
 * Created by dirceu on 14/03/17.
 */
public class DeadLock {
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
        public synchronized void passaDeVolta(Amigo passador) {
            System.out.printf("%s: %s"
                            + " voltou a bola pra mim!%n",
                    new Object[]{this.nome, passador.getNome()});
        }
        
            }

    public static void main(String[] args) {
        final Amigo neymar =
                new Amigo("Neymar");
        final Amigo ganso =
                new Amigo("Ganso");
        new Thread(new Runnable() {
            public void run() { neymar.passar(ganso); }
        }).start();
        new Thread(new Runnable() {
            public void run() { ganso.passar(neymar); }
        }).start();
    }
}
