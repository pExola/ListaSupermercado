package Implemetation;

public class SupermercadoArray implements Supermercado {

    private final String [] itens;

    private int ultimoIndex;

    public SupermercadoArray(final int size) {
        itens = new String[size];
        ultimoIndex = -1;
    }

    @Override
    public void add(String item) {
        if (ultimoIndex == itens.length-1) {
            System.err.println("Sua lista está cheia ");
        } else {
            ultimoIndex++;
            itens[ultimoIndex] = item;
        }
    }

    @Override
    public void print() {
        System.out.println("####################################");

        if(ultimoIndex < 0) {
            System.out.println("Sua lista está vazia");
        }
        for (int i = 0; i <= ultimoIndex; i++) {
            System.out.println(i + " - " + itens[i]);
        }
        System.out.println("####################################");
    }

    @Override
    public void remover(int index) {
        if (index >= 0 && index <= ultimoIndex) {
            shift(index);
            ultimoIndex--;
        } else {
            System.err.println("índice inválido: " + index);
        }
    }

    private void shift(final int index) {

        for (int i = index; i < ultimoIndex; i++) {
            itens[i] = itens[i + 1];
        }
    }
}
