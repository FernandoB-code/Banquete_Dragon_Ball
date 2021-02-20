package DragonBall;

public class Namekiano extends Extraterrestre {

	final static int KI_AL_COMER = 100;

	public Namekiano(int ki, int cantAliados) {
		super(ki, cantAliados);

	}

	@Override
	public int obtenerNuevoKI() {

		return KI_AL_COMER;
	}

	@Override
	public void mostrarEnergia() {
		
		System.out.println(getKi());
		
	}

	@Override
	public String toString() {
		return "Namekiano [getCantAliados()=" + getCantAliados() + ", getKi()=" + getKi() + "]";
	}

	
	
}
