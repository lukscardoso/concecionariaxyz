package br.com.concessionariaxyz.teste;

import br.com.concessionariaxyz.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculo objeto = new Veiculo();
		objeto.preencherCor("azul");
		System.out.println(objeto.retornarCor());
		
		
		objeto.preencherMontadora("ferrari");
		System.out.println(objeto.retornarMontadora());
		
		objeto.preencherValor(1000);
		System.out.println(objeto.retornarValor());
		
	
		System.out.println(objeto.toString());
	}

}
