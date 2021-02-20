package DragonBall;

public abstract class Personaje {

	private int ki;

	public Personaje(int ki) {
		super();
		setKi(ki);
	}

	public int getKi() {
		return ki;
	}

	private void setKi(int ki) {
		this.ki = ki;
	}

	public abstract void comerSemilla();

	public void aumentarKi(int energia) {

		this.ki += energia;

	}

	public abstract void mostrarEnergia();

}
