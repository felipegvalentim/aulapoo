package ListaDeChamada;

import java.sql.Time;

public class Materia {

    public String nome;

    public String descricao;

    public Double cargaHoraria;

    public Professor professor;

    public Integer quantidadeAulas;

    public Materia(String nome, String descricao, Double cargaHoraria, Professor professor, Integer quantidadeAulas){
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.quantidadeAulas = quantidadeAulas;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Integer getQuantidadeAulas() {
        return quantidadeAulas;
    }

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

    public long getDataId() {
        return getDataId();
    }
}
