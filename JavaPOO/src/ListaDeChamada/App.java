package ListaDeChamada;

import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("maiko.cunha@db1.com.br", "Maiko Cunha");
        Aluno aluno2 = new Aluno("joao.silva@db1.com.br", "João Silva");

        Professor professor = new Professor("igor.silva@db1.com.br", "Igor Silva");

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

        aula.listaAluno = null;

        System.out.println(aula);

    }
}
