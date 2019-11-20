package ListaDeChamada;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {
    public Date dataId;
    public Materia materia;
    public List<Aluno> listaAluno;

    public Aula(Date dataId, Materia materia, List<Aluno> listaAluno) {
        if(dataId == null)
            throw new CampoNaoPodeSerNulo("Data não pode ser nulo");
        if (materia == null)
            throw new CampoNaoPodeSerNulo("Materia não pode ser nulo");
        if(listaAluno == null)
            throw new CampoNaoPodeSerNulo("Aluno não pode ser nulo");
        this.dataId = dataId;
        this.materia = materia;
        this.listaAluno = listaAluno;
    }



    public Date getDataId() {
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
                ", \nmateria=" + materia +
                ", \nlistaAluno=" + listaAluno +
                '}';
    }
}
