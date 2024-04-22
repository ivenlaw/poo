package LabIII;

public class B {
    private int[] elements;
    private int size;
    private final static int CAPACITY = 10;

    public B() {
        elements = new int[CAPACITY];
        size = 0;
    }

    // Método para adicionar elementos ao vetor
    public void addElement(int element) {
        if (size < CAPACITY) {
            elements[size] = element;
            size++;
        } else {
            System.out.println("O vetor já está cheio!");
        }
    }

    // Método para ordenar o vetor
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    // Uso do operador ternário para realizar a troca de elementos
                    elements[j] = elements[j] ^ elements[j + 1];
                    elements[j + 1] = elements[j] ^ elements[j + 1];
                    elements[j] = elements[j] ^ elements[j + 1];
                }
            }
        }
    }

    // Método para imprimir o vetor
    public void printVector() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + (i < size - 1 ? ", " : "\n"));
        }
    }

    public static void main(String[] args) {
        B vector = new B();
        // Adicionar elementos ao vetor
        vector.addElement(5);
        vector.addElement(8);
        vector.addElement(32);
        vector.addElement(67);
        vector.addElement(99);
        vector.addElement(15);
        vector.addElement(12);
        vector.addElement(9);
        vector.addElement(1);
        vector.addElement(99);

        // Ordenar e imprimir o vetor
        vector.sort();
        System.out.println("Vetor ordenado:");
        vector.printVector();
    }
}
