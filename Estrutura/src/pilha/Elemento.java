package pilha;

/**
 * @author alexia.pereira
 */
public class Elemento {

    private String nome;

    public Elemento (String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}