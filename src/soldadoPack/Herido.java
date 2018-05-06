package soldadoPack;

public class Herido implements Estado {
	
	Soldado soldadoObj;
	
	public Herido(Soldado newSoldado) {
		
		soldadoObj = newSoldado;
	}

	@Override
	public void recibirDisparo() {
		System.out.println("AAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
		
		soldadoObj.setAgujeros(soldadoObj.getAgujeros() +1);
		soldadoObj.setEstado(soldadoObj.getMuerto());
			
	}

	@Override
	public void recibirCuracion() {
		
		System.out.println("Gracias por curarme las heridas! Ahora estoy saludable");
		soldadoObj.setEstado(soldadoObj.getSaludable());
		soldadoObj.setAgujeros(soldadoObj.getAgujeros() -1);
		
	}

}
