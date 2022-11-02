package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsuarioGeneral extends Usuario {

	private Set<Figurita> album;
	
	public UsuarioGeneral(Integer id, String nombre) {
		super(id, nombre);
		this.album = new TreeSet<Figurita>();
	}

	@Override
	public void agregarFigurita(Figurita figurita, Sistema db) throws CodigoExistente {
		if(!this.album.add(figurita)) {
			throw new CodigoExistente("Ya tenes esta figurita");
		}
	}
	
	public String getFiguritas () {
		String coleccion = "";
		for (Figurita figu : this.album) {
			coleccion += "," + figu.getNumero();
		}
		return coleccion;
	}
	
	public int getTotalFiguritas () {
		return this.album.size();
	}

	

}
