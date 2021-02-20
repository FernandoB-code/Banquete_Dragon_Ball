package DragonBall;

public abstract class Extraterrestre extends Personaje {
	final static int VALOR_PARA_EXTRA = 500;
	final static int CANT_ADICIONAL = 10;
	private int cantAliados;

	public Extraterrestre(int ki, int cantAliados) {
		super(ki);
		this.setCantAliados(cantAliados);
	}

	public int getCantAliados() {
		return cantAliados;
	}

	private void setCantAliados(int cantAliados) {
		this.cantAliados = cantAliados;
	}
	
	
	public abstract int obtenerNuevoKI();
	
	
	public void comerSemilla() {
		
		aumentarKi(obtenerNuevoKI());
		if (getKi() > VALOR_PARA_EXTRA) {
			
			aumentarKi(this.cantAliados * CANT_ADICIONAL);
			
		}
	}

	@Override
	public String toString() {
		return "Extraterrestre [cantAliados=" + cantAliados + "]";
	}
	
	
	
	

}
