package listaDuplamenteEncadeada;

/**
 * @author alexia.pereira
 */
public class Lista {

    private Nodo primeiro = null;
    private Nodo ultimo = null;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void adicionarInicio(String valor) {
        Nodo novoNodo = new Nodo(valor);

        if (this.primeiro == null) {
            this.primeiro = novoNodo;
            this.ultimo = novoNodo;
        } else {
            this.primeiro.setAnterior(novoNodo);
            novoNodo.setProximo(this.primeiro);
            this.primeiro = novoNodo;
        }
        this.tamanho++;
    }

    public void adicionarMeio(int posicao, String valor) {
        Nodo novoNodo = new Nodo(valor);
        novoNodo.setElemento(valor);

        Nodo auxiliar = this.primeiro;
        Nodo auxiliarDois = this.primeiro.getAnterior();

        if (posicao == this.getTamanho() || posicao == 0) {
            this.adicionarFim(valor);

        } else {
            for (int i = 0; i < posicao; i++) {
                auxiliar = auxiliar.getProximo();
                auxiliarDois = auxiliar.getAnterior();
            }
            novoNodo.setProximo(auxiliar);
            auxiliar.setAnterior(novoNodo);

            auxiliarDois.setProximo(novoNodo);
            novoNodo.setAnterior(auxiliarDois);
        }
        this.tamanho++;
    }

    public void adicionarFim(String valor) {
        Nodo novoNodo = new Nodo(valor);

        if (this.primeiro == null) {
            this.primeiro = novoNodo;
            this.ultimo = novoNodo;
        } else {
            novoNodo.setAnterior(this.ultimo);
            this.ultimo.setProximo(novoNodo);
            this.ultimo = novoNodo;
        }
        this.tamanho++;
    }

    public void imprimirLista() {

        if (this.tamanho == 0) {
            System.out.println("[]");

        } else {
            System.out.print("[ ");
            Nodo auxiliar = this.primeiro;

            for (int i = 0; i < this.tamanho; i++) {

                System.out.print(auxiliar.getElemento() + " ");
                auxiliar = auxiliar.getProximo();
            }
            System.out.println("]");
            System.out.println("--------------");
        }
    }

}
