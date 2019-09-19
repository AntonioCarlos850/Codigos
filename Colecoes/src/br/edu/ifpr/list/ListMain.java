package br.edu.ifpr.list;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.entidade.Autor;
import br.edu.ifpr.entidade.Exemplar;
import br.edu.ifpr.entidade.Livro;
import br.edu.ifpr.entidade.LivroComparador;
import java.util.Comparator;

public class ListMain {

	public static void main(String[] args) {
		Livro l1 = new Livro("123456", "Oracle");
		Livro l2 = new Livro("35678", "PHP");
		Livro l3 = new Livro("56789", "JavaScript");
		Livro l4 = new Livro("897234", "Pascal inutil");

		// =========== ARRAYLIST ===============
		System.out.println("=========== ARRAYLIST ===============");
		List<Integer> numerosAleatoriosList = new ArrayList<Integer>();

		numerosAleatoriosList.add(15);
		numerosAleatoriosList.add(5);
		numerosAleatoriosList.add(3);
		numerosAleatoriosList.add(45);
		numerosAleatoriosList.add(20);

		numerosAleatoriosList.sort(null);

		for (Integer numero : numerosAleatoriosList) {
			System.out.println(numero);
		}

		List<Livro> livrosList = new ArrayList<Livro>();

		livrosList.add(l1);
		livrosList.add(l2);
		livrosList.add(l3);

		System.out.println("Ordenado segundo o compareTo [ISBN]");
		livrosList.sort(null);

		for (Livro livro : livrosList) {
			System.out.println(livro);
		}

		System.out.println("Ordenado segundo o compare [TÍTULO]");
		LivroComparador comparador = new LivroComparador();
		livrosList.sort(comparador);

		for (Livro livro : livrosList) {
			System.out.println(livro);
		}

		// Tarefa

		// questao1
		System.out.println("\n");
		System.out.println("---------------TAREFA--------------");
		livrosList.add(1, l4);

		for (Livro livro : livrosList) {
			System.out.println(livro);
		}
		System.out.println("\n");

		// questao2
		livrosList.remove(0);

		for (Livro livro : livrosList) {
			System.out.println(livro);
		}

		// questao3
		System.out.println("\n" + livrosList.get(2));

		// questao4
		System.out.println("\nO tamanho da lista e: " + livrosList.size() + "\n");

		// questao 5 e 6
		livrosList.clear();
		System.out.println("A coleção esta vazia? " + (livrosList.isEmpty() ? " Sim" : " Não"));
		System.out.println("\n");

		// questao 7
		Autor aut1 = new Autor("Antonio");
		Autor aut2 = new Autor("Rafa");
		Autor aut3 = new Autor("Wesley");

		l4.getAutores().add(aut1);
		l1.getAutores().add(aut3);
		l3.getAutores().add(aut2);

		System.out.println("\nO autor do livro 1"+"\ne: ");
		for (Autor autores : l1.getAutores()) {
			System.out.println(autores);
		}

		System.out.println("\nO autor do livro 2" + "\ne: ");
		for (Autor autores : l3.getAutores()) {
			System.out.println(autores);
		}

		System.out.println("\nO autor do livro 4"+ "\ne: ");
		for (Autor autores : l4.getAutores()) {
			System.out.println(autores);
		}

	}

}
