package br.unip.sd;

import java.util.Scanner;

public class Multiplicacao {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int n1, n2, result;
		
		System.out.println("Entre com um valor inteiro");
		n1= ent.nextInt();
		System.out.println("Entre com outro valor inteiro");
		n2= ent.nextInt();
		
		result=n1*n2;
		
		System.out.println(n1+" * "+n2+" = "+result);
		

	}

}
