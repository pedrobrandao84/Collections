package Exercicio;

import java.util.Comparator;

public class PessoaComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getIdade() - o2.getIdade();
    }
}
