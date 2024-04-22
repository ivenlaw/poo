package LabIII;

public class C {
    private String[] elements;
    private int top;
    private final static int CAPACITY = 10;

    public C() {
        elements = new String[CAPACITY];
        top = -1;
    }

    // Método para empilhar um elemento na pilha
    public void push(String element) {
        if (top < CAPACITY - 1) {
            elements[++top] = element;
            System.out.println("Após empilhar: " + element);
            printStack();
        } else {
            System.out.println("Falha ao empilhar: A pilha está cheia!");
        }
    }

    // Método para desempilhar um elemento da pilha
    public String pop() {
        if (top == -1) {
            System.out.println("Falha ao desempilhar: A pilha está vazia!");
            return null;
        } else {
            String item = elements[top--];
            System.out.println("Após desempilhar: " + item);
            printStack();
            return item;
        }
    }

    // Método para imprimir a pilha
    private void printStack() {
        if (top == -1) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.print("Pilha atual: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(elements[i] + (i < top ? ", " : "\n"));
            }
        }
    }

    public static void main(String[] args) {
        C stack = new C();
        // Testando empilhar na pilha
        stack.push("Olá!");
        stack.push("Tudo bem?");
        stack.push("Como vai?");

        // Testando desempilhar da pilha
        stack.pop();
        stack.pop();

        // Testando erro ao desempilhar de pilha vazia
        stack.pop();
        stack.pop();
    }
}
