package Exercicios.Aula05;

import java.util.Scanner;

public class ClienteTesta {

	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Insira seu nome: " );
		cliente.setNome(leia.next());
		
		System.out.println("Insira sua Cidade: ");
		cliente.setCidade(leia.next());
		
		System.out.println("Insira seu telefone: ");
		cliente.setTelefone(leia.next());
		
		System.out.println("O nome �: " + cliente.getNome());
		System.out.println("A cidade �: " + cliente.getCidade());
		System.out.println("O telefone �: " + cliente.getTelefone());
		
		leia.close();
	}
	
}
