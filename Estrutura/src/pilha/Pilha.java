package pilha;

import java.util.LinkedList;

/**
 * @author alexia.pereira
 */
public class Pilha<T> {

    // O modo mais fácil seria usando o Stack do java, mas
    // imagino que esse não seria o propósito do trabalho
    private LinkedList<T> elementos = new LinkedList<T>();

    protected void adicionar(T t) {
        this.elementos.add(t);
    }

    protected T remover() {
        return this.estaVazia() ? this.printarListaVazia()
                : this.elementos.remove(this.elementos.size() - 1);
    }

    // Retornando apenas para não lidar com exceptions
    protected T imprimir() {
        if (this.estaVazia()) {
            this.printarListaVazia();
            return null;
        }
        this.elementos
                .descendingIterator()
                .forEachRemaining(this::imprimirElemento);
        return null;
    }

    private boolean estaVazia() {
        return this.elementos.size() == 0;
    }

    private T printarListaVazia() {
        System.out.println("Pilha vazia, por favor adicione um elemento primeiro");
        return null;
    }


    private void imprimirElemento(T t) {
        System.out.println(String.format("| %s |", t.toString()));
    }

}