package br.edu.ifpr.entidade;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Livro implements Comparable<Livro> {

	private String isbn;
	private String titulo;

	private List<Autor> autores = new ArrayList<Autor>();
	private Set<Exemplar> exemplares = new HashSet<Exemplar>();

	// get e set

	public String getIsbn() {
		return isbn;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public Set<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(Set<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// equals e hasCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result + ((exemplares == null) ? 0 : exemplares.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (exemplares == null) {
			if (other.exemplares != null)
				return false;
		} else if (!exemplares.equals(other.exemplares))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	// construtor
	public Livro() {

	}

	public Livro(String isbn, String titulo) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
	}

	// toString
	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", titulo=" + titulo + "]";
	}

	// Comparable
	@Override
	public int compareTo(Livro livro) {
		return this.isbn.compareTo(livro.getIsbn());
	}

}
