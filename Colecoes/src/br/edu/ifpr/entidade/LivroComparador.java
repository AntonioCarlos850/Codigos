package br.edu.ifpr.entidade;

import java.util.Comparator;

public class LivroComparador implements Comparator<Livro>{

	@Override
	public int compare(Livro livro1, Livro livro2) {
		return livro1.getTitulo().compareTo(livro2.getTitulo());
	}
	
	
}
