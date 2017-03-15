package br.unip.sd;
import java.util.Scanner;

/**
 * Created by dirceu on 14/03/17.
 */
public class DeadLock {
    

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
