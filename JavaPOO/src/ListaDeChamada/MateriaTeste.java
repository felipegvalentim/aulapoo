package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Time;

public class MateriaTeste  {
    @Test
    public void deveCriarMateriaPorMeioDoConstutor(){
        String nome = "POO";
        String descricao = "Abstração";
        Double cargaHoraria = 10.5;
        Integer quantidadeAulas = 3;

        Professor professor = new Professor("Maiko Cunha","maiko.cunha@db1.com.br");
        Materia materia = new Materia(nome, descricao, cargaHoraria, professor, quantidadeAulas);

        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(descricao, materia.getDescricao());
        Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
        Assert.assertEquals(professor, materia.getProfessor());
        Assert.assertEquals(quantidadeAulas, materia.getQuantidadeAulas());
    }
}