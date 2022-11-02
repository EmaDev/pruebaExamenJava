package ar.edu.unlam.pb2;

public class Administrador extends Usuario{

	public Administrador(Integer id, String nombre) {
		super(id, nombre);
		
	}

	@Override
	public void agregarFigurita(Figurita figurita, Sistema db) throws CodigoExistente {
		db.agregarFiguritaAlLaDB(figurita);
	}

}
