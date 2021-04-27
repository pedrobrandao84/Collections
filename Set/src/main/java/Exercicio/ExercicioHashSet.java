package Exercicio;

import java.util.HashSet;
import java.util.Iterator;

public class ExercicioHashSet {

    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //navega e imprime os itens do set
        Iterator<Integer> iteratorNumeros = numeros.iterator();
        while (iteratorNumeros.hasNext()){
            System.out.println(iteratorNumeros.next());
        }

        //remove primeiro item do set
        numeros.remove(3);
        System.out.println(numeros);

        //adiciona no numero 23
        numeros.add(23);
        System.out.println(numeros);

        //verifica tamanho do item
        System.out.println(numeros.size());

        //verifica se o set está vazio
        System.out.println(numeros.isEmpty());
    }
}
