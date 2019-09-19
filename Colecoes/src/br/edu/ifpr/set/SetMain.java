package br.edu.ifpr.set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import br.edu.ifpr.entidade.Exemplar;
import br.edu.ifpr.entidade.Livro;

public class SetMain {

	public static void main(String[] args) {

		Livro livro1 = new Livro("123456", "Java");
		Livro livro2 = new Livro("789456", "PHP completo");
		Livro livro3 = new Livro("465123", "C++ completo");
		

		// =========HashSet===============
		System.out.println("=========HashSet===============");

		Set<Livro> listaLivros = new HashSet<Livro>();

		listaLivros.add(livro1);
		listaLivros.add(livro2);
		listaLivros.add(livro3);

		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}

		// =========LinkedHashSet===============
		System.out.println("=========LinkedHashSet===============");

		Set<Livro> listaLivrosLinked = new LinkedHashSet<Livro>();

		listaLivrosLinked.add(livro1);
		listaLivrosLinked.add(livro2);
		listaLivrosLinked.add(livro3);

		for (Livro livro : listaLivrosLinked) {
			System.out.println(livro);
		}

		// =========LinkedHashSet===============
		System.out.println("=========Treeset===============");

		Set<Livro> listaLivrosTreeset = new TreeSet<Livro>();

		listaLivrosTreeset.add(livro1);
		listaLivrosTreeset.add(livro2);
		listaLivrosTreeset.add(livro3);

		for (Livro livro : listaLivrosTreeset) {
			System.out.println(livro);
		}
		
		//==============PRATICA===============
		
		//REMOVER UM ELEMENTO DA LISTA listaLivros
		
		listaLivros.remove(livro2);
		System.out.println("\n=========REMOVER UM ELEMENTO DA LISTA listaLivros======");
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
		
		//ADCIONAR ELEMNTOS DE UMA COLEÇÃO EM OUTRA COLEÇÃO
		Set<Livro> livrosAdicionais = new HashSet<Livro>();
		
		Livro livroAdicional1 = new Livro ("987456", "PostGreeSQL");
		Livro livroAdicional2 = new Livro ("123456", "Pythonzada");
		
		livrosAdicionais.add(livroAdicional1);
		livrosAdicionais.add(livroAdicional2);
		
		listaLivros.addAll(livrosAdicionais);
		
		System.out.println("\n=========LISTA ATUALIZADA======");
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
		
		//REMOVER ELEMNTOS DE UMA COLEÇÃO EM OUTRA COLEÇÃO
		
		listaLivros.removeAll(livrosAdicionais);
		
		System.out.println("\n=========REMOVER ELEMENTOS DE UMA COLEÇÃO======");
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
		
		//VERIFIVCAR SE UM ELEMENTO ESTA PRESENTE NA LISTA
		System.out.println("\nO elemento esta presente na coleção?" + 
		(listaLivros.contains(livro1)?" Sim": " Não"));
		
		System.out.println("\nO elemento esta presente na coleção?" + 
		(listaLivros.contains(livro2)?" Sim": " Não"));
		
		//ADICIONAR ELEMENTOS DUPLICADOS NA COLEÇÃO
		
		System.out.println("\nFoi possivel aidiconar um elemento na coleção?" + 
		(listaLivros.add(livro1)?" Sim": " Não"));
		
		//VERIFICAR O NUMERO DE ELEMNTOS CONTIDOS NA COLEÇÃO
		System.out.println("\nO numero de elemntos contidos na coleção é: " + 
		listaLivros.size());
		
		//VERIFICAR SE A COLEÇÃO ESTA VAZIA
		
		System.out.println("\nA coleção esta vazia? " + 
		(listaLivros.isEmpty()?" Sim": " Não"));
		
		//LIMPAR COLEÇÃO
		listaLivros.clear();
		
		//VERIFICAR SE A COLEÇÃO ESTÁ VAZIA
		System.out.println("\nA coleção esta vazia? " + 
		(listaLivros.isEmpty()?" Sim": " Não"));
		
		//EXEMPLARES DE LIVRO
		Exemplar ex1 = new Exemplar("111");
		Exemplar ex2 = new Exemplar("222");
		Exemplar ex3 = new Exemplar("333");
		
		livro1.getExemplares().add(ex1);
		livro1.getExemplares().add(ex2);
		livro1.getExemplares().add(ex3);
		
		System.out.println("\nOs exemplares do livro: \n" +
		livro1 + "\nSão: ");
		for(Exemplar exemplar : livro1.getExemplares()){
			System.out.println(exemplar);
		}
		
		
		
	}

}
