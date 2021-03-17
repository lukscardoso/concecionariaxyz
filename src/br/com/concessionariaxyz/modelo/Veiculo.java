package br.com.concessionariaxyz.modelo;

public class Veiculo {

	private String cor;
	private String montadora;
	private float valor;
	// Classes Wrappers: classe que apoia os tipos primitivos
	// Float => float - Integer => int - Double => double - Boolean => boolean
	
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo Param> <nome param>)
	
	public String retornarCor() {
		return cor;
		
	}
	
	public String retornarMontadora() {
		return montadora;
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public String toString() {
		return valor + cor + montadora;
	}
	
	public void preencherCor(String param) {
		if(param.length()>2) {
		cor = param.toUpperCase();
	}	
}
	public void preencherMontadora(String param) {
		montadora = param.toUpperCase();
	}
	
	public void preencherValor (float param) {
		valor = param;
	}
	
	
}
