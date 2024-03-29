package br.edu.ifpr.entidade;

public class Exemplar {

	//ATRIBUTOS
	private String codigo;

	//GET E SET
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	// EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exemplar other = (Exemplar) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Exemplar [codigo=" + codigo + "]";
	}
	
	//CONSTRUCTORS
	public Exemplar(){
		
	}
	
	public Exemplar(String codigo) {
		super();
		this.codigo = codigo;
	}
	
	
	
}
