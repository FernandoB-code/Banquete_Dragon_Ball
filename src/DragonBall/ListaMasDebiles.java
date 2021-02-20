package DragonBall;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaMasDebiles extends ListaOrdenadaNodos<Integer, Personaje> {

	@Override
	public int compare(Personaje p1, Personaje p2) {
		
		return p1.getKi() - p2.getKi();
	}

	@Override
	public int compareByKey(Integer ki, Personaje personaje) {
		
		return (ki - personaje.getKi());
	}

}
