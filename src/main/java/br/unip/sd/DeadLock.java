package br.unip.sd;
import java.util.Scanner;

/**
 * Created by dirceu on 14/03/17.
 */
public class DeadLock {
<<<<<<< HEAD
    
=======
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
        public void passaDeVolta(Amigo passador) {
            System.out.printf("%s: %s"
                            + " voltou a bola pra mim!%n",
                    new Object[]{this.nome, passador.getNome()});
        }
        
            }
>>>>>>> 413e23572f8788bd85c00c8c7186ba3c044bb7e4

    public static void main(String[] args) {
    	Scanner ent = new Scanner(System.in);
    	
    	double carb;
    	double cont;
    	
    	System.out.print("Informe o numero de Carboidratos: ");
    	carb = ent.nextDouble();
    	
    	cont = carb/10;
    	
    	System.out.println("O numero de humalog é: "+ cont + " ");
    	
        
    }
}
