package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Usuario {
	private Integer id;
	private String nombre;
	
	public Usuario(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}

	public abstract void agregarFigurita(Figurita figurita, Sistema db) throws CodigoExistente;
	
	
	
}
