package br.com.dio.queue.exercicio;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExecicioFinal {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("Joao");

        Iterator<String> iteratorFila = fila.iterator();
        while (iteratorFila.hasNext()){
            System.out.println(iteratorFila.next());
        }

        String primeiroDaFila = fila.peek();
        System.out.println("Primeiro da Fila :: " + primeiroDaFila);

        String primeiroDaFilaRemovendo = fila.poll();
        System.out.println("Primeiro da Fila :: " + primeiroDaFilaRemovendo);

        fila.add("Daniel");
        System.out.println(fila);

        //tamanho da lista
        System.out.println(fila.size());

        //verifica lista vazia
        System.out.println(fila.isEmpty());

        //verifica se nome carlos está na lista
        System.out.println(fila.contains("Carlos"));

    }

}
