package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AulaTeste {

    @Test
    public void deveCriarAulaPorMeioDoConstutor() {

        Date dataId = new Date();
        Professor professor = new Professor("maiko-cunha@db1.com.br", "Maiko Cunha");
        Materia materia = new Materia("POO", "Abstração",10.5, professor, 3);
        List<Aluno> aluno = new ArrayList<>();
        Aula aula = new Aula(dataId, materia, aluno);
        Assert.assertEquals(dataId, aula.getDataId());
        Assert.assertEquals(materia, aula.getMateria());
        Assert.assertEquals(aluno, aula.getListaAluno());


    }
}