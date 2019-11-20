package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

public class AlunoTeste  {

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
        String email = "fake@db1.com.br";
        try {
            Aluno aluno = new Aluno(email, null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveCriarAlunoPorMeioDoConstutor(){
        String email = "email.fake@email.com.br";
        String nome = "Fake";
        Aluno aluno = new Aluno(email,nome);
        Assert.assertEquals(email, aluno.getEmail());
        Assert.assertEquals(nome, aluno.getNome());
    }
}