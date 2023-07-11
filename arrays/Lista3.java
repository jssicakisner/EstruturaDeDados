package arrays;

import java.util.ArrayList;
import java.util.List;

public class Lista3<T> {
    private List<T> elementos;
    private int tamanho;

    public Lista3(int capacidade) {
        this.elementos = new ArrayList<>(capacidade);
        this.tamanho = 0;
    }

    public Lista3() {
        this(10);
    }

    public boolean adiciona(T elemento) {
        this.elementos.add(elemento);
        this.tamanho++;
        return true;
    }

    public boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.elementos.add(posicao, elemento);
        this.tamanho++;

        return true;
    }

    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos.get(posicao);
    }

    public int busca(T elemento) {
        return this.elementos.indexOf(elemento);
    }

    public int ultimoIndice(T elemento) {
        return this.elementos.lastIndexOf(elemento);
    }

    public boolean contem(T elemento) {
        return this.elementos.contains(elemento);
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.elementos.remove(posicao);
        this.tamanho--;
    }

    public void remove(T elemento) {
        this.elementos.remove(elemento);
        this.tamanho--;
    }

    public void limpar() {
        this.elementos.clear();
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return this.elementos.toString();
    }
}
