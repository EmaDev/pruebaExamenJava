package ar.edu.unlam.pb2;

import java.util.Objects;

public class Figurita implements Comparable<Figurita>{
	
	private Integer numero;
	private String seleccion;
	private String grupo;
	private String nombre;
	private Double valor;
	
	public Figurita(Integer numero, String seleccion, String grupo, String nombre, Double valor) {
		super();
		this.numero = numero;
		this.seleccion = seleccion;
		this.grupo = grupo;
		this.nombre = nombre;
		this.valor = valor;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getSeleccion() {
		return seleccion;
	}

	public String getGrupo() {
		return grupo;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getValor() {
		return valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(grupo, nombre, numero, seleccion, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurita other = (Figurita) obj;
		return Objects.equals(grupo, other.grupo) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(numero, other.numero) && Objects.equals(seleccion, other.seleccion)
				&& Objects.equals(valor, other.valor);
	}

	/*@Override
	public int compareTo(Figurita o) {
		if(o.getNumero().equals(getNumero())) {
			return 0;
		}
		return 1;
	}*/
	
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurita other = (Figurita) obj;
		return Objects.equals(numero, other.getNumero());
	}*/
	
	/*@Override
	public int compareTo(Figurita o) {
		if(this.grupo.equals(o.grupo)) {
			if(this.seleccion.equals(o.seleccion)) {
				return this.numero.compareTo(o.numero);
			}return this.seleccion.compareTo(o.seleccion);
		} return this.grupo.compareTo(o.grupo);
	}*/
	@Override
	public int compareTo(Figurita o) {
		
		if(getNumero() > o.getNumero()) {
			return 1;
		}else if(getNumero() < o.getNumero()) {
			return -1;
		}
		if(!getSeleccion().equals(o.getSeleccion())) {
			return 1;
		}
		return 0;
	}

	public Integer getNroFigurita() {
		return this.numero;
	}
	
	

}
