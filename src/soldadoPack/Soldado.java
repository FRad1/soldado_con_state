package soldadoPack;

public class Soldado {
	
	//tutorial de State: https://www.youtube.com/watch?v=MGEx35FjBuo
	
	Estado saludable;
	Estado herido;
	Estado muerto;
	
	Estado soldadoEstado;
	
	private int agujeros;
	
	
	public Soldado() {
		
		agujeros=0;
		
		saludable = new Saludable(this);
		herido = new Herido(this);
		muerto = new Muerto(this);
		
		soldadoEstado = saludable;
		
		
	}
	
	public void setEstado(Estado newSoldadoEstado) {
		soldadoEstado = newSoldadoEstado;
	}
	
	public Estado getEstado() {
		return soldadoEstado;
	}
	
	
	public void recibirDisparo() {
		
		soldadoEstado.recibirDisparo();
		
	}
	
	public void recibirCuracion() {
		
		soldadoEstado.recibirCuracion();
		
	}
	
	public Estado getSaludable() {
		return saludable;
	}
	
	public Estado getHerido() {
		return herido;
	}
	
	public Estado getMuerto() {
		return muerto;
	}
	
	
	public int getAgujeros() {
		
		return this.agujeros ;
	}
	

	public void setAgujeros(int a) {
		
		this.agujeros =a ;
	}
	
	
}
