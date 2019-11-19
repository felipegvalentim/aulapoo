package ListaDeChamada;

import java.sql.Time;

public class Materia {

    public String nome;

    public String descricao;

    public Double cargaHoraria;

    public Professor professor;

    public Integer quantidadeAulas;

    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", professor=" + professor +
                ", quantidadeAulas=" + quantidadeAulas +
                '}';
    }
}
