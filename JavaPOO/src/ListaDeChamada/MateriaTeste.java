package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Time;

public class MateriaTeste  {
    @Test
    public void deveCriarMateriaPorMeioDoConstutor(){
        String email = "maiko.cunha@db1.com.br";
        String nomeProfessor = "Maiko Cunha";
        String nome = "POO";
        String descricao = "Abstração, Encapsulamento, Polimorfismo, Herança";
        Double cargaHoraria = 10.5;
        Professor professor = new Professor(nomeProfessor,email);
        Integer quantidadeAulas = 3;
        Materia materia = new Materia(nome, descricao, cargaHoraria, professor, quantidadeAulas);
        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(descricao, materia.getDescricao());
        Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
        Assert.assertEquals(professor, materia.getProfessor());
        Assert.assertEquals(quantidadeAulas, materia.getQuantidadeAulas());
    }
}