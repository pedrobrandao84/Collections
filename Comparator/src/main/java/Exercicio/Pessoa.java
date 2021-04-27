package Exercicio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.function.UnaryOperator;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;

    public Integer getIdade(){
        return LocalDateTime.now().getYear() - this.dataNascimento.getYear();
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.getIdade() - o.getIdade();
    }
}
