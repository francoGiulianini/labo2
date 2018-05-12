package strategy;

public class Contexto {

	private Estrategia estrategia;
	
	public Estrategia getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}

	public String ejecutarAlgoritmo() {
		return this.getEstrategia().ejecutarAlgoritmo();
	}
}
