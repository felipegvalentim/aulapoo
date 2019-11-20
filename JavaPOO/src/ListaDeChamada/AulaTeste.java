package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class AulaTeste {

    @Test
    public void deveCriarAulaPorMeioDoConstutor() {

        String email = "maiko.cunha@db1.com.br";
        String nomeProfessor = "Maiko Cunha";
        String nome = "POO";
        String descricao = "Abstração, Encapsulamento, Polimorfismo, Herança";
        Double cargaHoraria = 10.5;
        Integer quantidadeAulas = 3;
        Professor professor = new Professor(nomeProfessor,email);
        Materia materia = new Materia(nome, descricao, cargaHoraria, professor, quantidadeAulas);
        Aluno aluno = new Aluno(email,nome);
        aluno.nota = 5.5;
        Integer dataId = 2016;
        Assert.assertEquals(Aula.getDataId());
        Assert.assertEquals(Aula.getMateria());
        Assert.assertEquals(Aula.getListaAluno());

    }
}