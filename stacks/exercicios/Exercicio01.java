package stacks.exercicios;

import java.util.Scanner;

import stacks.Pilha;

public class Exercicio01 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Entre com um numero:");

                int numero = scan.nextInt();

                if (numero % 2 == 0) {
                    System.out.println("Empilhando o numero " + numero);
                    pilha.empilha(numero);
                } else {
                    Integer desempilhado = pilha.desempilha();

                    if (desempilhado == null) {
                        System.out.println("Pilha esta vazia");
                    } else {
                        System.out.println("Numero impar, desempilhando um elemento da pilha: "
                                + desempilhado);
                    }
                }
            }
        }

        System.out.println("Todos os numero foram lidos, desempilhando numeros da pilha");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha: "
                    + pilha.desempilha());
        }
        System.out.println("Todos os elementos foram desempilhados");
    }
}
