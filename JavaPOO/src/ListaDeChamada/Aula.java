package ListaDeChamada;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {
    public Date dataId;
    public Materia materia;
    public List<Aluno> alunos = new ArrayList<>();

    public Aula(Date dataId, Materia materia) {
        if(dataId == null)
            throw new CampoNaoPodeSerNulo("Data não pode ser nulo");
        if (materia == null)
            throw new CampoNaoPodeSerNulo("Materia não pode ser nulo");
        this.dataId = dataId;
        this.materia = materia;
    }

    public void darPresenca(Aluno aluno){
        if(aluno == null)
            throw new CampoNaoPodeSerNulo("Aluno não pode ser nulo");
        this.alunos.add(aluno);
    }

    public int quantidadeDeAlunosPresentes(){
        return this.alunos.size();
    }

    public Date getDataId() {
        return dataId;
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "dataId=" + dataId +
                ", \nmateria=" + materia +
                ", \nlistaAluno=" + alunos +
                '}';
    }
}
