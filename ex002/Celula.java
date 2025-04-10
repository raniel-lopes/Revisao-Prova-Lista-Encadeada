package ex002;

public class Celula {

	private Viagem valor;
	private Celula proximo;

	public Viagem getValor() {
		return valor;
	}

	public void setValor(Viagem valor) {
		this.valor = valor;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

}
