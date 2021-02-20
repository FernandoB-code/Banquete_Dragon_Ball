package DragonBall;

import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class Banquete {

	private ColaNodos<Personaje> colaComida;

	public Banquete() {

		this.colaComida = new ColaNodos<Personaje>();
		Demonio d1 = new Demonio(0);
		Namekiano n1 = new Namekiano(0, 2);
		Saiyajin s1 = new Saiyajin(0, 9, false);
		Saiyajin s2 = new Saiyajin(0, 4, true);
		Terricola t1 = new Terricola(0);

		this.colaComida.add(d1);
		this.colaComida.add(n1);
		this.colaComida.add(s1);
		this.colaComida.add(s2);
		this.colaComida.add(t1);

	}

	public void desarrollar() {

		Terricola cent = new Terricola(0);

		this.colaComida.add(cent);

		Personaje p = this.colaComida.remove();

		while (p != cent) {

			p.comerSemilla();
			this.colaComida.add(p);
			p = this.colaComida.remove();

		}

	}

	public void mostrarEnergia() {

		Terricola cent = new Terricola(0);

		this.colaComida.add(cent);

		Personaje p = this.colaComida.remove();

		while (p != cent) {

			p.mostrarEnergia();			
			this.colaComida.add(p);
			p = this.colaComida.remove();
		}
	}

	public void listarMasDebiles(int cantidad) {

		ListaMasDebiles listaDebiles = new ListaMasDebiles();

		llenarLista(listaDebiles);

		if (listaDebiles.size() < cantidad) {

			cantidad = listaDebiles.size();

		}

		for (int i = 0; i < cantidad; i++) {

			System.out.println(listaDebiles.get(i));

		}

	}

	private void llenarLista(ListaMasDebiles lista) {

		Terricola cent = new Terricola(0);

		this.colaComida.add(cent);

		Personaje p = this.colaComida.remove();

		while (p != cent) {

			lista.add(p);
			this.colaComida.add(p);
			p = this.colaComida.remove();

		}
	}

}
