package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AulaTeste {
    @Test
    public void deveJogarExceptionComDataNulo(){
        try {
            Professor professor = new Professor("email@db1.com.br", "Teste");
            Materia materia = new Materia("POO", "Abstração", 10.5, professor, 3);
            List<Aluno> aluno = new ArrayList<>();
            Aula aula = new Aula(null, materia, aluno);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Data não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExceptionComMateriaNulo(){
        try {
            Date dataId = new Date();
            Professor professor = new Professor("email@db1.com.br", "Teste");
            List<Aluno> aluno = new ArrayList<>();
            Aula aula = new Aula(dataId, null, aluno);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Materia não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExceptionComAlunoNulo(){
        try {
            Date dataId = new Date();
            Professor professor = new Professor("email@db1.com.br", "Teste");
            Materia materia = new Materia("POO", "Abstração", 10.5, professor, 3);
            Aula aula = new Aula(dataId, materia, null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Aluno não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

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