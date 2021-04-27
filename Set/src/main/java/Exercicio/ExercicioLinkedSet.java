package Exercicio;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExercicioLinkedSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
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
        numeros.remove(3);
        System.out.println(numeros);

        //adiciona numero 23
        numeros.add(23);
        System.out.println(numeros);

        //verifica tamanho
        System.out.println(numeros.size());

        //verifica se vazio
        System.out.println(numeros.isEmpty());


    }
}
