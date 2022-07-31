package one.digitalinnovation.gof.strategy;

public class Robo {
	
	private Comportamento Comportamento;

	

	public void setComportamento(Comportamento comportamento) {
		this.Comportamento = comportamento;
	}



	public void mover() {
		Comportamento.mover();
	}
}
