package DragonBall;

public class Terricola extends Personaje {
	
	final static int CANT_ENERGIA = 200;
	
	
	

	public Terricola(int ki) {
		super(ki);
	
	}

	@Override
	public void comerSemilla() {
		
		aumentarKi(200);
		
	}

	@Override
	public void mostrarEnergia() {
		System.out.println(getKi());
		
	}

	@Override
	public String toString() {
		return "Terricola [getKi()=" + getKi() + "]";
	}
	
	
	

}
