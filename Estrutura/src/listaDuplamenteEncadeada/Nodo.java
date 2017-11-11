package listaDuplamenteEncadeada;

/**
 * @author alexia.pereira
 */
public class Nodo {
    private Nodo proximo;
    private Nodo anterior;
    private String elemento;

    public Nodo(String elemento) {
        this.proximo = null;
        this.anterior = null;
        this.elemento = elemento;
    }

    public Nodo getProximo() {
        return this.proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public String getElemento() {
        return this.elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
}
