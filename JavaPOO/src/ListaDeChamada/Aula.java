package ListaDeChamada;

import java.util.Date;
import java.util.List;

public class Aula {
    public Date dataId;
    public Materia materia;
    public List<Aluno> listaAluno;

    @Override
    public String toString() {
        return "Aula{" +
                "dataId=" + dataId +
                ", materia=" + materia +
                ", listaAluno=" + listaAluno +
                '}';
    }
}
