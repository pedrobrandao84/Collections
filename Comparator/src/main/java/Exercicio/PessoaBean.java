package Exercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PessoaBean {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("Pedro", LocalDate.parse("1984-10-11"), "010.155.981-02"));
        listaPessoas.add(new Pessoa("Iara", LocalDate.parse("1987-06-30"), "017.075.691-26"));
        listaPessoas.add(new Pessoa("Joao", LocalDate.parse("1980-01-20"), "111.111.111-11"));
        listaPessoas.add(new Pessoa("Maria", LocalDate.parse("1954-07-03"), "222.222.222-22"));
        listaPessoas.add(new Pessoa("Frederico", LocalDate.parse("1989-02-01"), "333.333.333-33"));
        listaPessoas.add(new Pessoa("Jeferson", LocalDate.parse("2000-03-15"), "444.444.444-44"));

        //imprime lista
        System.out.println(listaPessoas);

        //ordena com Comparable
        Collections.sort(listaPessoas);
        System.out.println(listaPessoas);

        //ordenação lambda
        listaPessoas.sort((o1, o2) -> o1.getIdade() - o2.getIdade()).reve;
        System.out.println(listaPessoas);

        //ordenacao comparator reverso
        listaPessoas.sort(Comparator.comparingInt(Pessoa::getIdade).reversed());
        System.out.println(listaPessoas);

    }
}
