package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTeste  {
    @Test
    public void deveJogarExceptionComEmailNulo(){
        String nome = "Fake";
        try {
            Aluno aluno = new Aluno(null, nome);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Email não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExceptionComNomeNulo(){
        String email = "fake@db1.com";
        try {
            Aluno aluno = new Aluno(email, null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveCriarProfessorPorMeioDoConstutor(){
        String email = "fake@email.com";
        String nome = "Fake";
        Professor professor = new Professor(email,nome);
        Assert.assertEquals(email, professor.getEmail());
        Assert.assertEquals(nome, professor.getNome());
    }
}