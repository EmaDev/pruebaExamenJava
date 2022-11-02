package ar.edu.unlam.pb2;

import java.util.Set;
import java.util.TreeSet;

public class Sistema {
	
	private Set<Figurita> figuritasDB;
	
	public Sistema (){
		this.figuritasDB = new TreeSet<Figurita>();
	}
	
	public void agregarFiguritaAlLaDB(Figurita figurita) throws CodigoExistente {
		if(!this.figuritasDB.add(figurita)) {
			throw new CodigoExistente("Ya existe esta figurita en la DB");
		}
	}
	
}
