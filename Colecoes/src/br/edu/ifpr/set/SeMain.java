package br.edu.ifpr.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import br.edu.ifpr.entidade.Livro;

public class SeMain {

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
		System.out.println("=========REMOVER UM ELEMENTO DA LISTA listaLivros======");
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
		
		
	}

}
