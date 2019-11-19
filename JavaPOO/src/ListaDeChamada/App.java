package ListaDeChamada;

import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maiko Cunha";
        aluno1.email = "maiko.cunha@db1.com.br";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Jõao Silva";
        aluno2.email = "joao.silva@db1.com.br";

        Professor professor = new Professor();
        professor.nome = "Igor Silva";
        professor.email = "igor.silva@db1.com.br";

        Materia materia = new Materia();
        materia.nome = "POO";
        materia.descricao = "Abstração, Encapsulamento, Polimorfismo, Herança";
        materia.cargaHoraria = 10.5;
        materia.quantidadeAulas = 3;
        materia.professor = professor;

        Aula aula = new Aula();
        aula.dataId = new Date();
        aula.materia = materia;
        aula.listaAluno = new ArrayList<Aluno>();
        aula.listaAluno.add(aluno1);
        aula.listaAluno.add(aluno2);

        System.out.println(aula);

        aula.toString();

    }
}
