package ex002;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	// Método para adicionar
	public void adicionar(Viagem valor) {
		// Cria a casinha(celula)
		Celula celula = new Celula();

		// Coloca o valor dentro da casinha
		celula.setValor(valor);

		// Condição para saber como está a lista
		if (primeiro == null && ultimo == null) {
			// Entro apenas se a lista estiver vazia
			primeiro = celula;
			ultimo = celula;
		} else {
			// Entro quando a lista já conter um dado
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}

	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		}else if(posicaoAtual == null){
			posicaoAtual = primeiro;
			return true;
		}else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
		 
	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}
	

	// esse eh  o nosso metodo para excluir contato
	public void remover() {
		if(primeiro.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
		
		
	}
	
	private Celula recuperarPenultimo(Celula celula) {
		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
		
	}
	
	public void listar() {
	    Celula atual = primeiro;
	    while (atual != null) {
	        System.out.println(atual.getValor());
	        atual = atual.getProximo();
	    }
	}
}
