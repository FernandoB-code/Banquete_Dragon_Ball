package DragonBall;

public class Saiyajin extends Extraterrestre {

	final static int KI_AL_COMER = 200;
	private boolean estaEnModoOzaru;

	public boolean isEstaEnModoOzaru() {
		return estaEnModoOzaru;
	}

	private void setEstaEnModoOzaru(boolean estaEnModoOzaru) {
		this.estaEnModoOzaru = estaEnModoOzaru;
	}

	public Saiyajin(int ki, int cantAliados, boolean estaEnModoOzaru) {
		super(ki, cantAliados);
		setEstaEnModoOzaru(estaEnModoOzaru);
	}

	@Override
	public int obtenerNuevoKI() {

		return KI_AL_COMER;
		
	}

	public int getKi() {

		int ki = super.getKi();

		if (estaEnModoOzaru) {

			ki = ki * 10;

		}

		return ki;

	}

	@Override
	public void mostrarEnergia() {
		
		System.out.println(getKi());		
	}

	@Override
	public String toString() {
		return "Saiyajin [estaEnModoOzaru=" + estaEnModoOzaru + ", getKi()=" + getKi() + "]";
	}

	
}
