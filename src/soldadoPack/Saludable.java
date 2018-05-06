package soldadoPack;

public class Saludable implements Estado {
	
	Soldado soldadoObj;
	
	public Saludable(Soldado newSoldado) {
		
		soldadoObj = newSoldado;
	}

	@Override
	public void recibirDisparo() {
		
		System.out.println("Ahhhh!");
		
		soldadoObj.setAgujeros(soldadoObj.getAgujeros() +1);
		soldadoObj.setEstado(soldadoObj.getHerido());
		
	}

	@Override
	public void recibirCuracion() {
		
		System.out.println("Gracias pero ya estoy saludable");
	}

	
}
