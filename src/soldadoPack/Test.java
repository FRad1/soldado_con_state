package soldadoPack;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;



public class Test {
	

	@org.junit.Test
	public void testSoldadoSaludable() {
		
		Soldado s = new Soldado() ;
		
		s.recibirDisparo();
		
		Assert.assertEquals(s.getEstado(), s.getHerido());
		Assert.assertEquals(1, s.getAgujeros());
		
	}
	
	@org.junit.Test
	public void testSoldadoHerido() {
		
		Soldado s = new Soldado() ;
		
		s.recibirDisparo();
		s.recibirDisparo();
		
		Assert.assertEquals(2, s.getAgujeros());
		Assert.assertEquals(s.getEstado(), s.getMuerto());
		
		
	}
	
	@org.junit.Test
	public void testCurarSoldadoSaludable() {
		
		Soldado s = new Soldado() ;
		
		s.recibirDisparo();
		s.recibirCuracion();
		
		Assert.assertEquals(0, s.getAgujeros());
		Assert.assertEquals(s.getEstado(), s.getSaludable());
		
		
	}
	
	@org.junit.Test
	public void testCurarSoldadoMuerto() {
		
		Soldado s = new Soldado() ;
		
		s.recibirDisparo();
		s.recibirDisparo();
		s.recibirCuracion();
		
		Assert.assertEquals(1, s.getAgujeros());
		Assert.assertEquals(s.getEstado(), s.getSaludable());
		Assert.assertNotEquals(s.getEstado(), s.getMuerto());
		Assert.assertNotEquals(s.getEstado(), s.getHerido());
		
		
	}
	
	
	

}
