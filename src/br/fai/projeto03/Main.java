package br.fai.projeto03;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		int idade= scanner.nextInt();
		
		if(idade>20) {
			System.out.println("Idade maior que 20");
			
		}
		else if(idade>12 && idade <17) {
			System.out.println("Idade menor que 12 e maior que 17");
		}
		else if( idade ==7 || idade < 5){
			System.out.println("Idade menor que 5 ou igual a 7");
			
		}
	}

}
