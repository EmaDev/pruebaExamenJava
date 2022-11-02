package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void queSePuedaCrearUnaFigurita() {
		Figurita figu = new Figurita(45, "Argentina", "C", "De Paul", 30000.0);
		
		Integer esperado = 45;
		
		assertEquals(esperado, figu.getNumero());
	}
	
	@Test //(expected = CodigoExistente.class)
	public void queUnAdministradorPuedaAgregarUnaFigurita() throws CodigoExistente {
		Sistema db = new Sistema();
		Administrador admin = new Administrador(1766, "Del Moro");
		Figurita figu = new Figurita(45, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu2 = new Figurita(47, "Argentina", "C", "De Paul", 30000.0);
		
		admin.agregarFigurita(figu, db);
		admin.agregarFigurita(figu2, db);
	}
	
	@Test 
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() throws CodigoExistente {
		Sistema db = new Sistema();
		UsuarioGeneral user = new UsuarioGeneral(1766, "Del Moro");
		Figurita figu = new Figurita(45, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu2 = new Figurita(45, "Brasil", "C", "De Paul", 30000.0);
		Figurita figu3 = new Figurita(88, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu4 = new Figurita(15, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu5 = new Figurita(12, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu6 = new Figurita(255, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu7 = new Figurita(89, "Argentina", "C", "De Paul", 30000.0);
		user.agregarFigurita(figu2, db);
		user.agregarFigurita(figu, db);
		user.agregarFigurita(figu4, db);
		user.agregarFigurita(figu3, db);
		user.agregarFigurita(figu5, db);
		user.agregarFigurita(figu7, db);
		user.agregarFigurita(figu6, db);
		
		assertEquals(7, user.getTotalFiguritas());
	}
	
	@Test
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas() throws CodigoExistente {
		Sistema db = new Sistema();
		UsuarioGeneral user = new UsuarioGeneral(1766, "Del Moro");
		Figurita figu = new Figurita(20, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu2 = new Figurita(12, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu4 = new Figurita(14, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu5 = new Figurita(16, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu6 = new Figurita(8, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu7 = new Figurita(45, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu3 = new Figurita(88, "Argentina", "C", "De Paul", 30000.0);
		Figurita figu9 = new Figurita(88, "Tunez", "C", "De Paul", 30000.0);
		
		user.agregarFigurita(figu2, db);
		user.agregarFigurita(figu9, db);
		user.agregarFigurita(figu3, db);
		user.agregarFigurita(figu5, db);
		user.agregarFigurita(figu6, db);
		user.agregarFigurita(figu7, db);
		
		System.out.println(user.getFiguritas());
		
	}
	@Test 
	public void TestDeGit() {
		
	}
}
