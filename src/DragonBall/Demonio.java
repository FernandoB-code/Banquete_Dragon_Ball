package DragonBall;

public class Demonio extends Personaje {

	final static int ENERGIA = 200;
	public Demonio(int ki) {
		super(ki);
		
	}

	@Override
	public void comerSemilla() {
		
		this.aumentarKi(ENERGIA);
		
	}

	@Override
	public void mostrarEnergia() {
		System.out.println(getKi());
		
	}

	@Override
	public String toString() {
		return "Demonio [getKi()=" + getKi() + "]";
	}
	
	
	}


	
	
	


