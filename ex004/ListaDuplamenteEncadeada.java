package ex004;

public class ListaDuplamenteEncadeada {
    private Nodo primeiro = null;
    private Nodo ultimo = null;
    private int n = 0;

    public void inserirListaEsquerda(String valor) {
        Nodo aux = new Nodo();
        aux.setDado(valor);

        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
        } else {
            aux.setProximo(primeiro);
            primeiro.setAnterior(aux);
            primeiro = aux;
        }
        n++;
    }

    public void inserirListaDireita(String valor) {
        Nodo aux = new Nodo();
        aux.setDado(valor);

        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
        } else {
            aux.setAnterior(ultimo);
            ultimo.setProximo(aux);
            ultimo = aux;
        }
        n++;
    }

    public String removerListaEsquerda() {
        if (n == 0) return "Lista vazia!";
        String dado = primeiro.getDado();

        if (n == 1) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        n--;
        return dado;
    }

    public String removerListaDireita() {
        if (n == 0) return "Lista vazia!";
        String dado = ultimo.getDado();

        if (n == 1) {
            primeiro = null;
            ultimo = null;
        } else {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        n--;
        return dado;
    }

    public void listarListaImprimir() {
        Nodo aux = primeiro;
        if (aux != null) {
            System.out.println("Professores da lista:");
            while (aux != null) {
                System.out.println("- " + aux.getDado());
                aux = aux.getProximo();
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }
}
