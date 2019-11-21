package ListaDeChamada;

import java.sql.Time;

public class Materia {

    public String nome;

    public String descricao;

    public Double cargaHoraria;

    public Professor professor;

    public Integer quantidadeAulas;

    public Materia(String nome, String descricao, Double cargaHoraria, Professor professor, Integer quantidadeAulas){
        if(nome == null)
            throw new CampoNaoPodeSerNulo("Nome não pode ser nulo");
        if(descricao == null)
            throw new CampoNaoPodeSerNulo("Descrição não pode ser nulo");
        if(cargaHoraria == null)
            throw new CampoNaoPodeSerNulo("Carga Horária não pode ser nulo");
        if(professor == null)
            throw new CampoNaoPodeSerNulo("Professor não pode ser nulo");
        if(quantidadeAulas == null)
            throw new CampoNaoPodeSerNulo("Quantidade de Aulas não pode ser nulo");
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.quantidadeAulas = quantidadeAulas;
        this.professor = professor;
    }

    public void trocaProfessor(Professor professor){
        this.professor = professor;
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
