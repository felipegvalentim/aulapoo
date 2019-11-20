package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTeste  {
    @Test
    public void deveCriarProfessorPorMeioDoConstutor(){
        String email = "fake@email.com";
        String nome = "Fake";
        Professor professor = new Professor(null,nome);
        Assert.assertEquals(email, professor.getEmail());
        Assert.assertEquals(nome, professor.getNome());
    }
}