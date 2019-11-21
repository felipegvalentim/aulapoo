package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Time;

public class MateriaTeste  {
    @Test
    public void deveTrocarProfessor(){
        Professor professor1 = new Professor("felipe@db1.com.br", "Felipe");
        Professor professor2 = new Professor("rogerio@db1.com.br", "Rogerio");

        Materia materia = new Materia("POO", "Encapsulamento", 10.5, professor1, 3);

        Assert.assertEquals(professor1, materia.getProfessor());

    }

    @Test
    public void deveJogarExceptionComNomeNulo(){
        try {
            Professor professor = new Professor("email@db1.com.br", "Teste");
            Materia materia = new Materia(null, "Abstração", 10.5, professor, 3);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExceptionComDescricaoNulo(){
        try {
            Professor professor = new Professor("email@db1.com.br", "Teste");
            Materia materia = new Materia("POO", null, 10.5, professor, 3);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Descrição não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExceptionComCargaHorariaNulo(){
        try {
            Professor professor = new Professor("email@db1.com.br", "Teste");
            Materia materia = new Materia("POO", "Abstração", null, professor, 3);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Carga Horária não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExceptionComProfessorNulo(){
        try {
            Materia materia = new Materia("POO", "Abstração", 10.5, null, 3);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Professor não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExceptionComQuantidadeDeAulasNulo(){
        try {
            Professor professor = new Professor("email@db1.com.br", "Teste");
            Materia materia = new Materia("POO", "Abstração", 10.5, professor, null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Quantidade de Aulas não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
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