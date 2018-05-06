package soldadoPack;

public class Muerto implements Estado {
	
	Soldado soldadoObj;
	
	public Muerto(Soldado newSoldado) {
		
		soldadoObj = newSoldado;
	}

	@Override
	public void recibirDisparo() {
		soldadoObj.setAgujeros(soldadoObj.getAgujeros() +1);

	}

	@Override
	public void recibirCuracion() {
		
		System.out.println("Graciela pero ahora quiero comer cerebros, yo ya revivi");
		soldadoObj.setEstado(soldadoObj.getSaludable());
		soldadoObj.setAgujeros(soldadoObj.getAgujeros() -1);

	}

}
