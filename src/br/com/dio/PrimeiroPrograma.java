package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		//criando objeto gato
		
		Gato gato = new Gato( "Margot", "Preto", 2);
		System.out.println(gato);
		
		Gato gato2 = new Gato("Simba", "Caramelo", 5);
		System.out.println(gato2);

	}

}
