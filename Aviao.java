package Exercicios.Aula05;

	/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.*/

	//Exercicio 2
public class Aviao {
	
	private int numAssentos;
	private String piloto;
	private String companhia;
	
	public void setnumAssento(int numAssentos) {
		this.numAssentos = numAssentos;
	}
	
	public void setpiloto(String piloto) {
		this.piloto = piloto;
	}
	
	public void setcompanhia(String companhia) {
		this.companhia = companhia;
	}
	
	public int getnumAssentos() {
		return numAssentos;
	}
	
	public String getpiloto() {
		return piloto;
	}
	
	public String getcompanhia() {
		return companhia;
	}
}
