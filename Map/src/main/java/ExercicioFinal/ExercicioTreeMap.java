package ExercicioFinal;

import java.util.HashMap;
import java.util.TreeMap;

public class ExercicioTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> estados = new TreeMap<>();
        estados.put("AC","Acre");
        estados.put("AL","Alagoas");
        estados.put("AP","Amapá");
        estados.put("AM","Amazonas");
        estados.put("BA","Bahia");
        estados.put("CE","Ceará");
        estados.put("ES","Espírito Santo");
        estados.put("GO","Goiás");
        estados.put("MA","Maranhão");
        estados.put("MT","Mato Grosso");
        estados.put("MS","Mato Grosso do Sul");
        estados.put("MG","Minas Gerais");
        estados.put("PA","Pará");
        estados.put("PB","Paraíba");
        estados.put("PR","Paraná");
        estados.put("PE","Pernambuco");
        estados.put("PI","Piauí");
        estados.put("RJ","Rio de Janeiro");
        estados.put("RN","Rio Grande do Norte");
        estados.put("RS","Rio Grande do Sul");
        estados.put("RO","Rondônia");
        estados.put("RR","Roraima");
        estados.put("SC","Santa Catarina");
        estados.put("SP","São Paulo");
        estados.put("SE","Sergipe");
        estados.put("TO","Tocantins");

        //imprime estados
        System.out.println(estados);

        //remove Minas Gerais
        estados.remove("MG");
        System.out.println(estados);

        //adiciona o DF
        estados.put("DF","Distrito Federal");
        System.out.println(estados);

        //verifica tamanho
        System.out.println(estados.size());

        //remove Mato Grosso do Sul pelo nome
        estados.values().remove("Mato Grosso do Sul");
        System.out.println(estados);

        //imprime estados no forma "Estado (SIGLA)"
        for (String keyEstado : estados.keySet()){
            System.out.println(estados.get(keyEstado) + " (" + keyEstado + ")");
        }

        //verifica se Estado SC existe por SIGLA
        System.out.println(estados.containsKey("SC"));

        //verifica se o Estado "Maranhão" existe
        System.out.println(estados.containsValue("Maranhão"));

        //ordena decrescente
        System.out.println(estados.descendingMap());


    }
}
