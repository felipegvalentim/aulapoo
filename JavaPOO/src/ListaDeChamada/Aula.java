package ListaDeChamada;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {
    public Integer dataId;
    public Materia materia;
    public List<Aluno> listaAluno;

    public Aula(Integer dataId, Materia materia, List<Aluno> listaAluno) {
        this.dataId = dataId;
        this.materia = materia;
        this.listaAluno = listaAluno;
    }


    public Integer getDataId() {
        return dataId;
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "dataId=" + dataId +
                ", materia=" + materia +
                ", listaAluno=" + listaAluno +
                '}';
    }
}
