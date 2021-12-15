package Exercicios.Aula05;

import java.util.Scanner;

public class AviaoTesta {

	public static void main(String[] args) {
	//numAssentos, piloto, companhia	
	Aviao testa = new Aviao();
		
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Insira a quantidade de assentos: ");
	testa.setnumAssento(leia.nextInt());
	
	System.out.println("Insira o nome do piloto: ");
	testa.setpiloto(leia.next());
	
	System.out.println("Insira o nome da companhia: ");
	testa.setcompanhia(leia.next());
	
	
	System.out.println("A quantidade de assentos é: " + testa.getnumAssentos());
	System.out.println("Digite o nome do piloto: " + testa.getpiloto());
	System.out.println("Digite o nome da companhia: " + testa.getcompanhia());
	
	leia.close();

	}

}
