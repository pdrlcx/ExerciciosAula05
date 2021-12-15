package Exercicios.Aula05;


	/*Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/


	//Exercicio 01
public class Cliente {

	private String nome1;
	private String cidade;
	private String telefone;
	
	//void: não tem retorno
	//metodos sao açoes -- set recebe -- public deixa publico e pode ser acessado
	//this: ele fala que é a variavel la em cima -- da classe
	public void setNome(String nome) {
		this.nome1 = nome;
		
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	//get pega
	public String getNome() {
		return this.nome1;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
}