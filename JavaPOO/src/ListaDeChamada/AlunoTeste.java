package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

public class AlunoTeste  {
    @Test
    public void deveCriarAlunoPorMeioDoConstutor(){
        String email = "email.fake@email.com.br";
        String nome = "Fake";
        Aluno aluno = new Aluno(email,nome);
        Assert.assertEquals(email, aluno.getEmail());
        Assert.assertEquals(nome, aluno.getNome());
    }
}