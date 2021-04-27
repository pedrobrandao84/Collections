package Exercicio;

import java.util.*;

public class ExercicioTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //imprime set
        System.out.println(numeros);

        //navega entre set e imprime
        Iterator<Integer> iteratorNumeros = numeros.iterator();
        while (iteratorNumeros.hasNext()){
            System.out.println(iteratorNumeros.next());
        }

        //remove o primeiro
        numeros.pollFirst();
        System.out.println(numeros);

        //adiciona numero 23
        numeros.add(23);
        System.out.println(numeros);

        //verifica tamanho
        System.out.println(numeros.size());

        //verifica se vazio
        System.out.println(numeros.isEmpty());

        //ordena
        System.out.println(numeros.descendingSet());
    }
}
