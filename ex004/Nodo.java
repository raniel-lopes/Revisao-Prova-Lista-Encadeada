package ex004;

public class Nodo {

    private String dado;
    private Nodo anterior;
    private Nodo proximo;

    public Nodo() {
        this.dado = null;
        this.anterior = null;
        this.proximo = null;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
